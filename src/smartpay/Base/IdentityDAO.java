/**
 * 
 */
package smartpay.Base;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author lokesh.a.arora
 * 
 */
public class IdentityDAO {

	private JdbcTemplate jdbcTemplate;

	/**
	 * @return the dataSource
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *            the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
