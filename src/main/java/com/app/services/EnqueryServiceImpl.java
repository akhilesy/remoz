package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Enquery;
import com.app.repository.EnqueryRepo;
import com.app.vo.UserVo;

@Service
public class EnqueryServiceImpl  implements EnqueryService{

	private EnqueryRepo enqueryrepo;
	
	
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
		return enqueryrepo.findAll();
	}

}
