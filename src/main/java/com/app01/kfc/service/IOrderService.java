package com.app01.kfc.service;

import com.app01.kfc.bean.Order;

import java.util.List;

public interface IOrderService {

    List<Order> findAll();

    void saveOrUpdate(Order order);

    void deleteById(Long id);

    void batchDelete(Long[] ids);

}
