package com.wind.dao;

import com.wind.entity.Help;
import com.wind.entity.HelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpMapper {
    long countByExample(HelpExample example);

    int deleteByExample(HelpExample example);

    int deleteByPrimaryKey(Integer hId);

    int insert(Help row);

    int insertSelective(Help row);

    List<Help> selectByExample(HelpExample example);

    Help selectByPrimaryKey(Integer hId);

    int updateByExampleSelective(@Param("row") Help row, @Param("example") HelpExample example);

    int updateByExample(@Param("row") Help row, @Param("example") HelpExample example);

    int updateByPrimaryKeySelective(Help row);

    int updateByPrimaryKey(Help row);
}