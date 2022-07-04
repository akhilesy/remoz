/**
 * 
 */
package com.app.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;

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
public class Enquery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	
}
