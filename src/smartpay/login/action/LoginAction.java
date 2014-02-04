/**
 * 
 */
package smartpay.login.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import smartpay.login.bean.LoginBean;
import smartpay.login.dao.LoginDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author lokesh.a.arora
 * 
 */
public class LoginAction extends ActionSupport implements
		ModelDriven<LoginBean>, SessionAware {

	private LoginDAO loginDAO;
	private LoginBean loginBean;
	private static final long serialVersionUID = 1L;
	private SessionMap sessionMap;

	@Override
	public LoginBean getModel() {
		return loginBean;
	}

	public String login() {
		if (loginBean.getPassword() == null
				|| "".equalsIgnoreCase(loginBean.getPassword())) {
			addFieldError("password", getText("password.required"));
			return ERROR;
		}
		if (loginBean.getUserName() == null
				|| "".equalsIgnoreCase(loginBean.getUserName())) {
			addFieldError("userName", getText("username.required"));
			return ERROR;
		}

		// clearErrorsAndMessages();
		if (getLoginDAO().isUserExists(loginBean.getUserName(),
				loginBean.getPassword())) {
			sessionMap.put("userName", loginBean.getUserName());
			return SUCCESS;
		}
		return ERROR;
	}

	public String logout() {
//		sessionMap.invalidate();
		HttpSession session = ServletActionContext.getRequest().getSession(
				false);
		session.invalidate();
		return SUCCESS;
	}

	public String createUser() {
		getLoginDAO().createUser(loginBean.getUserName(),
				loginBean.getPassword());
		return SUCCESS;
	}

	public String create() {
		return SUCCESS;
	}

	public String log() {
		HttpSession session = ServletActionContext.getRequest().getSession(
				false);
		if (session != null && session.getAttribute("userName") != null) {
			return "logged";
		}
		// if (sessionMap.get("userName") != null) {
		// if (loginBean.getPassword() != null) {
		// return "logged";
		// }
		// }
		return SUCCESS;
	}

	/**
	 * @return the loginDAO
	 */
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	/**
	 * @param loginDAO
	 *            the loginDAO to set
	 */
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	/**
	 * @return the loginBean
	 */
	public LoginBean getLoginBean() {
		return loginBean;
	}

	/**
	 * @param loginBean
	 *            the loginBean to set
	 */
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	@Override
	public void setSession(Map map) {
		sessionMap = (SessionMap) map;

	}

}
