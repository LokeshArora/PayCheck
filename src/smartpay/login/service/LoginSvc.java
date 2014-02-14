package smartpay.login.service;

/**
 * @author lokesh.a.arora
 * 
 */
public interface LoginSvc {

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean isUserExists(String userName, String password);

	/**
	 * @param userName
	 * @param password
	 */
	public void createUser(String userName, String password);

}
