package com.wind.dao;

import com.wind.entity.Order;
import com.wind.entity.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(Order row);

    int insertSelective(Order row);

    List<Order> selectByExample(OrderExample example);

    List<Order> selectByKeyword(String keyword);

    List<Order> selectByExampleWithUser(OrderExample example);

    Order selectByPrimaryKey(Integer oId);

    Order selectByPrimaryKeyWithUser(Integer oId);

    int updateByExampleSelective(@Param("row") Order row, @Param("example") OrderExample example);

    int updateByExample(@Param("row") Order row, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order row);

    int updateByPrimaryKey(Order row);
}