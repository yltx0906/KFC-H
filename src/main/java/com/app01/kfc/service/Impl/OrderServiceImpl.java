package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.Order;
import com.app01.kfc.bean.OrderExample;
import com.app01.kfc.mapper.OrderMapper;
import com.app01.kfc.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        OrderExample example = new OrderExample();
        return orderMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Order order) {
        if(order.getId() == null){
            orderMapper.insert(order);
        }else {
            orderMapper.updateByPrimaryKey(order);
        }
    }

    @Override
    public void deleteById(Long id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for(long id : ids){
            orderMapper.deleteByPrimaryKey(id);
        }

    }

}
