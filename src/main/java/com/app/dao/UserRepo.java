/**
 * 
 */
package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.model.User;

/**
 * @author 91826
 *
 */
public interface UserRepo extends JpaRepository<User, Integer> {
	
	@Query("SELECT u FROM User u where u.userName=:email")
	public User getUserByUserName(@Param("email") String email);
	
	

}
