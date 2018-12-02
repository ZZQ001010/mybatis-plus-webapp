package com.zznr.anshen.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zznr.anshen.beans.PtUser;

public interface PtUserMapper extends BaseMapper<PtUser> {

	List<PtUser> deleteAll(); 
}
