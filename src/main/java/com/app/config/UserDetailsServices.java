/**
 * 
 */
/*
 * 
 * package com.app.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * 
 * import com.app.dao.UserRepo; import com.app.model.User;
 * 
 *//**
	 * @author 91826
	 *
	 *//*
		 * public class UserDetailsServices implements UserDetailsService{
		 * 
		 * @Autowired private UserRepo userrepo;
		 * 
		 * 
		 * @Override public UserDetails loadUserByUsername(String username) throws
		 * UsernameNotFoundException { User user=userrepo.getUserByUserName(username);
		 * 
		 * if(user==null) { throw new UsernameNotFoundException("username not found ");
		 * } CustomUserDetails customUserDetails=new CustomUserDetails(user); return
		 * customUserDetails; }
		 * 
		 * }
		 */