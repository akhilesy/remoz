/**
 * 
 */
package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 91826
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enquery implements Serializable, AutoCloseable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  username;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String alternateNumber;
	private String email;
	private String remark;
	private String fullAddress;
	private String pincode;
	@Temporal(TemporalType.DATE)
	private Date lastLogin;
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
