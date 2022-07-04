/**
 * 
 */
package com.app.model;

/**
 * @author 91826
 *
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "student") 

public class Student implements AutoCloseable, Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// official info
	@Column(name = "registration_no", nullable = false, unique = true)
	private String registration_no; // DWS/BR/100012 self generated

	@Column(name = "enrollment_no", nullable = false, unique = true)
	private String enrollment_no; // 10001201 self generated

	/*
	 * @ManyToOne // (cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "session_id", referencedColumnName = "id") private Session
	 * session;
	 * 
	 * @ManyToOne // (cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "courseid", referencedColumnName = "id") private Course
	 * course;
	 * 
	 * @ManyToOne // (cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "branchid", referencedColumnName = "id") private Branch
	 * branch;
	 * 
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "mark_id", referencedColumnName = "id") private
	 * StudentsMarks studentmark;
	 */

	// personal info
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = true)
	private String lastName;

	private String imgPath;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name = "aadharNo", nullable = false, unique = true)
	private String aadharNo;

	@Column(name = "mobile", nullable = false)
	private String mobile;

	private String phone_no;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "fatherName", nullable = false)
	private String fatherName;

	@Column(name = "motherName", nullable = false)
	private String motherName;

	@Column(name = "categoty", nullable = false)
	private String categoty;

	private String qualification;

	@Temporal(TemporalType.DATE)
	private Date addmissionDate; // self update

	private String address;
	private String district;
	private String state;
	private String country;
	private String pinCode;

	@Column(name = "updatedby", nullable = false)
	private String updatedby;

	@Temporal(TemporalType.DATE)
	private Date lastupdate;

	@Column(name = "version", nullable = false, columnDefinition = "int default 0")
	private int version;

	@Column(name = "is_deleted", nullable = false, columnDefinition = "int default 0")
	private int is_deleted;

	@Column(name = "status", nullable = false, columnDefinition = "int default 0")
	private int status; // 0 - current or 1 - passesout or 2 - droppedout

	@Column(name = "is_admitcard_issued", nullable = false, columnDefinition = "int default 0")
	private int is_admitcard_issued;

	@Column(name = "is_certificate_issued", nullable = false, columnDefinition = "int default 0")
	private int is_certificate_issued;

	@Column(name = "is_markssheet_issued", nullable = false, columnDefinition = "int default 0")
	private int is_markssheet_issued;

	@Column(name = "is_duplicate_certificate_issued", nullable = false, columnDefinition = "int default 0")
	private int is_duplicate_certificate_issued;

	@Column(name = "is_duplicate_markssheet_issued", nullable = false, columnDefinition = "int default 0")
	private int is_duplicate_markssheet_issued;

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
