package com.test.mapper;

import com.test.entity.CardCategoryEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CardCategoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CardCategoryEntity record);

    int insertSelective(CardCategoryEntity record);

    CardCategoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardCategoryEntity record);

    int updateByPrimaryKey(CardCategoryEntity record);
}