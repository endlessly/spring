package com.test.mapper;

import com.test.entity.TripEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TripEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TripEntity record);

    int insertSelective(TripEntity record);

    TripEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TripEntity record);

    int updateByPrimaryKey(TripEntity record);
}