/**
 * 
 */
package com.app.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.app.model.Enquery;
import com.app.model.User;
import com.app.vo.UserVo;

/**
 * @author 91826
 *
 */
@Component
public class EduDao {
	
	/*
	 * @Autowired private JdbcTemplate jdbct;
	 * 
	 * @Autowired private HibernateTemplate hibernettemplete;
	 */
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User getUser(String email) {
		
		Session session=null;
		User usr=new User();
		
		
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("FROM User WHERE userName =?");
			query.setParameter(0, email); 
			//query.setParameter(1, SaltEncryptorOrDecryptor.encrypt(user.getPassword()));
			usr = (User) query.uniqueResult();
			
			System.out.println("in dao class");
			
			
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
		}
		
		return usr;
	}

public UserVo saveEnquery(UserVo uservo) {
	UserVo usr=new UserVo();
		Session session=null;
	Enquery enq=new Enquery();		
		try {
			enq.setFirstName(uservo.getFirstName());
			enq.setLastName(uservo.getLastName());
			enq.setMobileNumber(uservo.getMobileNumber());
			enq.setAlternateNumber(uservo.getAlternateNumber());
			enq.setEmail(uservo.getEmail());
			enq.setPincode(uservo.getPincode());
			enq.setFullAddress(uservo.getFullAddress());
			enq.setRemark(uservo.getRemark());
			
			
			
			session=sessionFactory.openSession();
			session.beginTransaction();
			enq=(Enquery) session.save(enq);
			if(enq!=null) {
			usr.setId(enq.getId());
			usr.setFirstName(enq.getFirstName());
			}
			
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
		}
		
		return usr;
	}

	
	
	
}
