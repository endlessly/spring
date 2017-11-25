package com.test.mapper;

import com.test.entity.TripInfoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TripInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TripInfoEntity record);

    int insertSelective(TripInfoEntity record);

    TripInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TripInfoEntity record);

    int updateByPrimaryKeyWithBLOBs(TripInfoEntity record);

    int updateByPrimaryKey(TripInfoEntity record);
}