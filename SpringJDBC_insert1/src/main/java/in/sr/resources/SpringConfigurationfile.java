package in.sr.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigurationfile {
	
	@Bean
	public  DriverManagerDataSource mydatasource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("Satendrasa123@");
		return datasource;
	}
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(mydatasource());
		return template;
	}
}
