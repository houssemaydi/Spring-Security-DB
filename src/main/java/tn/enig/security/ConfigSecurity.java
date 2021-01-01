package tn.enig.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ConfigSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	// get users with roles

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder crypt = cryptageMP();

		// auth.inMemoryAuthentication().withUser("ali").password("enig").roles("USER");

		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery(
						"select username as principal, password as credentials, active from user where username=?")
				.authoritiesByUsernameQuery(
						"select user_username as principal,roles_role as role from user_roles where user_username=?")
				.passwordEncoder(crypt).rolePrefix("ROLE_");
	}

	protected void configure(HttpSecurity http) throws Exception {
		
		//prompt
		//http.httpBasic();
		
		http.formLogin();
		http.authorizeRequests().antMatchers("/add**/**", "/delete**/**", "/save**/**").hasRole("ADMIN");
		//all needs auth
		http.authorizeRequests().anyRequest().authenticated();
		http.csrf();
		http.exceptionHandling().accessDeniedPage("/Page404");
	}

	@Bean
	public PasswordEncoder cryptageMP() {
		return new BCryptPasswordEncoder();
	}

}
