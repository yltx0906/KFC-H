package com.app01.kfc.web.controller;

import com.app01.kfc.bean.Product;
import com.app01.kfc.service.IProductService;
import com.app01.kfc.utils.Message;
import com.app01.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("findAll")
    private Message findAll(){
        List<Product> list = productService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Product product){
        productService.saveOrUpdate(product);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        productService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
    @PostMapping("batchDelete")
    public Message batchDelete(@RequestBody Long[] ids){
        productService.batchDelete(ids);
        return MessageUtil.success("删除成功");
    }

}
