package cn.bzs.mapper;

import cn.bzs.domain.CONTRACT;


public interface CONTRACTMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(CONTRACT record);

    int insertSelective(CONTRACT record);

    CONTRACT selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(CONTRACT record);

    int updateByPrimaryKey(CONTRACT record);
}