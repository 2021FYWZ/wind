package com.wind.dao;

import com.wind.entity.Feedback;
import com.wind.entity.FeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {
    long countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Feedback row);

    int insertSelective(Feedback row);

    List<Feedback> selectByExample(FeedbackExample example);

    Feedback selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("row") Feedback row, @Param("example") FeedbackExample example);

    int updateByExample(@Param("row") Feedback row, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback row);

    int updateByPrimaryKey(Feedback row);
}