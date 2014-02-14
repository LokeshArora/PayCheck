/**
 * 
 */
package smartpay.login.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import smartpay.login.bean.LoginBean;
import smartpay.login.service.LoginSvc;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author lokesh.a.arora
 * 
 */
public class LoginAction extends ActionSupport implements
		ModelDriven<LoginBean>, SessionAware {

	private LoginSvc loginSvc;
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
		if (getLoginSvc().isUserExists(loginBean.getUserName(),
				loginBean.getPassword())) {
			sessionMap.put("userName", loginBean.getUserName());
			return SUCCESS;
		}
		return ERROR;
	}

	public String logout() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession(
				false);
		if (session != null) {
			session.invalidate();
		}
		return SUCCESS;
	}

	public String createUser() {
		getLoginSvc().createUser(loginBean.getUserName(),
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

	@SuppressWarnings("rawtypes")
	@Override
	public void setSession(Map map) {
		sessionMap = (SessionMap) map;

	}

	/**
	 * @return the loginSvc
	 */
	public LoginSvc getLoginSvc() {
		return loginSvc;
	}

	/**
	 * @param loginSvc
	 *            the loginSvc to set
	 */
	public void setLoginSvc(LoginSvc loginSvc) {
		this.loginSvc = loginSvc;
	}

}
