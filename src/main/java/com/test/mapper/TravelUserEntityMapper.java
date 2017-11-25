package com.test.mapper;

import com.test.entity.TravelUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TravelUserEntity record);

    int insertSelective(TravelUserEntity record);

    TravelUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TravelUserEntity record);

    int updateByPrimaryKey(TravelUserEntity record);
}