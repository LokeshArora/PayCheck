/**
 * 
 */
package smartpay.login.dao;

import smartpay.Base.IdentityDAO;

/**
 * @author lokesh.a.arora
 * 
 */
public class LoginDAO {

	IdentityDAO identityDAO;

	public boolean isUserExists(String userName, String password) {
		String checkuser = "select count(*) from user where User_Name = ? and Password = ?";
		int rowCnt = identityDAO.getJdbcTemplate().queryForInt(checkuser,
				new Object[] { userName, password });
		if (rowCnt != 1) {
			return false;
		}
		System.out.println("User Exists = " + userName + " Age = "
				+ password);
		return true;
	}

	/**
	 * @return the identityDAO
	 */
	public IdentityDAO getIdentityDAO() {
		return identityDAO;
	}

	/**
	 * @param identityDAO
	 *            the identityDAO to set
	 */
	public void setIdentityDAO(IdentityDAO identityDAO) {
		this.identityDAO = identityDAO;
	}

	public void createUser(String userName, String password) {
		String createUserQry = "insert into user values (? , ?)";
		identityDAO.getJdbcTemplate().update(createUserQry,
				new Object[] { userName, password });
	}

}
