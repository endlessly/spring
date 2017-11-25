package com.test.mapper;

import com.test.entity.TutuUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TutuUserEntityMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(TutuUserEntity record);

    int insertSelective(TutuUserEntity record);

    TutuUserEntity selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(TutuUserEntity record);

    int updateByPrimaryKey(TutuUserEntity record);

    TutuUserEntity selectByMobile(String mobile);
}