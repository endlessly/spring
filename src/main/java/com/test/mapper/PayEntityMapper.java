package com.test.mapper;

import com.test.entity.PayEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PayEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayEntity record);

    int insertSelective(PayEntity record);

    PayEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayEntity record);

    int updateByPrimaryKey(PayEntity record);
}