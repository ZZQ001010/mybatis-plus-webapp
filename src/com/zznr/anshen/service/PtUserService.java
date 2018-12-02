package com.zznr.anshen.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.zznr.anshen.beans.PtUser;


public interface PtUserService  extends IService<PtUser>{

	List<PtUser> deleteAll(); 
}
