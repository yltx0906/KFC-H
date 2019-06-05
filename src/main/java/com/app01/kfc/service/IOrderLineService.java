package com.app01.kfc.service;

import com.app01.kfc.bean.OrderLine;

import java.util.List;

public interface IOrderLineService {

    List<OrderLine> findAll();

    void saveOrUpdate(OrderLine orderLine);

    void deleteById(Integer id);


}
