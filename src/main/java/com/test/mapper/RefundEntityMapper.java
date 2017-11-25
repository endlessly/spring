package com.test.mapper;

import com.test.entity.RefundEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefundEntity record);

    int insertSelective(RefundEntity record);

    RefundEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefundEntity record);

    int updateByPrimaryKey(RefundEntity record);
}