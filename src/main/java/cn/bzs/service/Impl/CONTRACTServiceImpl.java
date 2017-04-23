package cn.bzs.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bzs.domain.CONTRACT;
import cn.bzs.mapper.CONTRACTMapper;
import cn.bzs.service.CONTRACTService;

@Service
public class CONTRACTServiceImpl implements CONTRACTService{
	
	@Autowired
	private CONTRACTMapper cm;
	@Override
	public CONTRACT find(String id) {
		return cm.selectByPrimaryKey(id);
	}

}
