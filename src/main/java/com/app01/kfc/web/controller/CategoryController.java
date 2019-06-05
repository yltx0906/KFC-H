package com.app01.kfc.web.controller;

import com.app01.kfc.bean.Category;
import com.app01.kfc.service.ICategoryService;
import com.app01.kfc.utils.Message;
import com.app01.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("findAll")
    private Message finAll(){
        List<Category> list = categoryService.findAll();
        return MessageUtil.success(list);
    }


    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Category category){
        categoryService.saveOrUpdate(category);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        categoryService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
    @PostMapping("batchDelete")
    public Message batchDelete(@RequestBody Long[] ids){
        categoryService.batchDelete(ids);
        return MessageUtil.success("删除成功");
    }


}
