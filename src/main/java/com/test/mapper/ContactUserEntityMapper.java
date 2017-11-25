package com.test.mapper;

import com.test.entity.ContactUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactUserEntity record);

    int insertSelective(ContactUserEntity record);

    ContactUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactUserEntity record);

    int updateByPrimaryKey(ContactUserEntity record);
}