package com.app01.kfc.web.controller;

import com.app01.kfc.bean.Order;
import com.app01.kfc.service.IOrderService;
import com.app01.kfc.utils.Message;
import com.app01.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("findAll")
    private Message findAll(){
        List<Order> list = orderService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Order order){
        orderService.saveOrUpdate(order);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        orderService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
    @PostMapping("batchDelete")
    public Message batchDelete(@RequestBody Long[] ids){
        orderService.batchDelete(ids);
        return MessageUtil.success("删除成功");
    }


}
