package com.test.mapper;

import com.test.entity.TripCommentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TripCommentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TripCommentEntity record);

    int insertSelective(TripCommentEntity record);

    TripCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TripCommentEntity record);

    int updateByPrimaryKey(TripCommentEntity record);
}