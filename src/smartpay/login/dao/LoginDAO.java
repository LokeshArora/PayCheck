package smartpay.login.dao;

/**
 * @author lokesh.a.arora
 *
 */
public interface LoginDAO {

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
