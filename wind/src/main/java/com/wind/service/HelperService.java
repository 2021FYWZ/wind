package com.wind.service;

import com.wind.entity.Helper;
import com.wind.entity.HelperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelperService {
    int countByExample(HelperExample example);

    int deleteByExample(HelperExample example);

    int deleteByPrimaryKey(Integer hId);

    int insert(Helper record);

    int insertSelective(Helper record);

    List<Helper> selectByExample(HelperExample example);

    Helper selectByPrimaryKey(Integer hId);

    int updateByExampleSelective(@Param("record") Helper record, @Param("example") HelperExample example);

    int updateByExample(@Param("record") Helper record, @Param("example") HelperExample example);

    int updateByPrimaryKeySelective(Helper record);

    int updateByPrimaryKey(Helper record);
}
