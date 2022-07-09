package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Enquery;
import com.app.repository.EnqueryRepo;
import com.app.repository.UserRepo;
import com.app.vo.UserVo;

@Service
public class EnqueryServiceImpl  implements EnqueryService{

	private EnqueryRepo enqueryrepo;
	@Autowired
	private UserRepo userrepo;
	
	
	public  EnqueryServiceImpl(EnqueryRepo enqueryrepo) {
		super();
		this.enqueryrepo=enqueryrepo;
	}
	
	@Override
	public Enquery saveEnquery(UserVo uservo) {
		Enquery enq=new Enquery();
		enq.setFirstName(uservo.getFirstName());
		enq.setLastName(uservo.getLastName());
		enq.setMobileNumber(uservo.getMobileNumber());
		enq.setAlternateNumber(uservo.getAlternateNumber());
		enq.setEmail(uservo.getEmail());
		enq.setPincode(uservo.getPincode());
		enq.setFullAddress(uservo.getFullAddress());
		enq.setRemark(uservo.getRemark());
		return enqueryrepo.save(enq);
	}

	@Override
	public List<Enquery> getAllEnquery() {
		System.out.println(userrepo.toString());
		System.out.println(enqueryrepo.toString());
		return enqueryrepo.findAll();
	}

}
