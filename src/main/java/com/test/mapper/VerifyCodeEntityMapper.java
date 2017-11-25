package com.test.mapper;

import com.test.entity.VerifyCodeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface VerifyCodeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VerifyCodeEntity record);

    int insertSelective(VerifyCodeEntity record);

    VerifyCodeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VerifyCodeEntity record);

    int updateByPrimaryKey(VerifyCodeEntity record);
    VerifyCodeEntity selectByMobile(String mobile);
}