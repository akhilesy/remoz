/**
 * 
 */
package com.app.config;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 91826
 *
 */
public class HibernetConfigUtil {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;

	
	public SessionFactory getseSessionFactory() {
		if(entityManagerFactory.unwrap(SessionFactory.class)==null) {
			throw new NullPointerException("factory is not created");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
}
