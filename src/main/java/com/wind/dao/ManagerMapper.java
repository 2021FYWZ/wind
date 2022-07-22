package com.wind.dao;

import com.wind.entity.Manager;
import com.wind.entity.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    long countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Manager row);

    int insertSelective(Manager row);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("row") Manager row, @Param("example") ManagerExample example);

    int updateByExample(@Param("row") Manager row, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager row);

    int updateByPrimaryKey(Manager row);
}