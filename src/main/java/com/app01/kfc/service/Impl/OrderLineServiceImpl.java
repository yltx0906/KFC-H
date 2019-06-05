package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.OrderLine;
import com.app01.kfc.bean.OrderLineExample;
import com.app01.kfc.mapper.OrderLineMapper;
import com.app01.kfc.service.IOrderLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderLineServiceImpl implements IOrderLineService {

    @Resource
    private OrderLineMapper orderLineMapper;

    @Override
    public List<OrderLine> findAll() {
        OrderLineExample example = new OrderLineExample();
        return orderLineMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(OrderLine orderLine) {
        if(orderLine.getId() == null){
            orderLineMapper.insert(orderLine);
        }else {
            orderLineMapper.updateByPrimaryKey(orderLine);
        }
    }

    @Override
    public void deleteById(Integer id) {
        orderLineMapper.deleteByPrimaryKey(id);
    }



}
