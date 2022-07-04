/**
 * 
 */
/*
 * package com.app.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 *//**
	 * @author 91826
	 *
	 *//*
		 * 
		 * @Configuration
		 * 
		 * @EnableWebSecurity public class Userconfig extends
		 * WebSecurityConfigurerAdapter{
		 * 
		 * 
		 * 
		 * @Bean public UserDetailsServices getDetailsServices() { return new
		 * UserDetailsServices(); }
		 * 
		 * @Bean public BCryptPasswordEncoder passwordEncoder() { return new
		 * BCryptPasswordEncoder(); }
		 * 
		 * 
		 * @Bean public DaoAuthenticationProvider authenticationProvider() {
		 * DaoAuthenticationProvider authenticationProvider=new
		 * DaoAuthenticationProvider();
		 * authenticationProvider.setUserDetailsService(this.getDetailsServices());
		 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
		 * authenticationProvider; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
		 * Exception { auth.authenticationProvider(authenticationProvider()); }
		 * 
		 * //$2a$10$EsNmDFlqrbiwzy6IAMp5EeIC65KWayl3m5n7Lell5Z0IJmB8/9FWO 12345
		 * 
		 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
		 * Exception { auth.inMemoryAuthentication() .withUser("abc").password(
		 * "$2a$10$G7PMfMCcSJjqIRHyZ4/niuZTTjOyew5QggOLlK29R6p.kj/2UF5QO").roles("admin"
		 * )//1234 .and() .withUser("akhil").password(
		 * "$2a$10$EsNmDFlqrbiwzy6IAMp5EeIC65KWayl3m5n7Lell5Z0IJmB8/9FWO").roles("user")
		 * ; //12345 }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * @Override protected void configure(HttpSecurity http) throws Exception {
		 * http.authorizeRequests() .antMatchers("/user/index").authenticated()
		 * .antMatchers("/welcome").hasRole("admin") .and()
		 * .formLogin().loginPage("/login").loginProcessingUrl("/login") .and()
		 * .httpBasic() .and().logout();
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */