package com.zznr.anshen.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zznr.anshen.beans.PtUser;
import com.zznr.anshen.mapper.PtUserMapper;
import com.zznr.anshen.service.PtUserService;

@Service
public  class PtUserServiceImp extends ServiceImpl<PtUserMapper,PtUser>  implements PtUserService {

	@Autowired
	PtUserMapper ptUserMapper; 
	
	@Override
	public List<PtUser> deleteAll() {
		return ptUserMapper.deleteAll(); 
	}
	
	
}
