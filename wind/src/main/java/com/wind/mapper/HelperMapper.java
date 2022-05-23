package com.wind.mapper;

import com.wind.entity.Helper;
import com.wind.entity.HelperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelperMapper {
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