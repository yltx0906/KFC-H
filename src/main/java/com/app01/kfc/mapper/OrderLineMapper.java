package com.app01.kfc.mapper;

import com.app01.kfc.bean.OrderLine;
import com.app01.kfc.bean.OrderLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    long countByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int deleteByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int insert(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int insertSelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    List<OrderLine> selectByExample(OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    OrderLine selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int updateByExample(@Param("record") OrderLine record, @Param("example") OrderLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int updateByPrimaryKeySelective(OrderLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kfc_order_line
     *
     * @mbg.generated Mon May 20 10:07:27 CST 2019
     */
    int updateByPrimaryKey(OrderLine record);
}