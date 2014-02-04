/**
 * 
 */
package smartpay.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import smartpay.login.dto.LoginDTO;

/**
 * @author lokesh.a.arora
 *
 */
public class LoginRowMapper implements RowMapper {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public LoginDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new LoginDTO();
	}

}
