/**
 * 
 */
package smartpay.Base;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 * @author lokesh.a.arora
 * 
 */
public class IdentityDAO {

	private SimpleJdbcTemplate jdbcTemplate;
	public IdentityDAO(){
		
	}
	
	public IdentityDAO(SimpleJdbcTemplate jdbcTemplate) {  
        this.jdbcTemplate = jdbcTemplate;  
	}  

	/**
	 * @return the dataSource
	 */
	public SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 *            the jdbcTemplate to set
	 */
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
