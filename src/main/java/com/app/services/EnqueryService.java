package com.app.services;

import java.util.List;

import com.app.model.Enquery;
import com.app.vo.UserVo;

public interface EnqueryService {
	
	public Enquery saveEnquery(UserVo userVo);
	
	public List<Enquery> getAllEnquery();

}
