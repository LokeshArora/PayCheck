/**
 * 
 */
package smartpay.login.service;

import smartpay.login.dao.LoginDAO;

/**
 * @author lokesh.a.arora
 * 
 */
public class LoginSvcImpl implements LoginSvc {

	LoginDAO loginDAO;

	@Override
	public boolean isUserExists(String userName, String password) {
		return getLoginDAO().isUserExists(userName, password);
	}

	@Override
	public void createUser(String userName, String password) {
		getLoginDAO().createUser(userName, password);
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

}
