package com.zznr.anshen.controller.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zznr.anshen.beans.PtUser;
import com.zznr.anshen.service.PtUserService;

@RequestMapping("/xtgl/user")
@Controller
public class PtUserController {

	@Autowired(required=true)
	PtUserService ptUserService ; 
	
	@ResponseBody
	@RequestMapping("/selectList")
	public List<PtUser> selectList(){
		return ptUserService.deleteAll();
	}
}
