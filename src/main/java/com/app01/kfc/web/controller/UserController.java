package com.app01.kfc.web.controller;

import com.app01.kfc.bean.User;
import com.app01.kfc.service.IUserService;
import com.app01.kfc.utils.Message;
import com.app01.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("findAll")
    private Message findAll(){
        List<User> list = userService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(User user){
        userService.saveOrUpdate(user);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        userService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
    @PostMapping("batchDelete")
    public Message batchDelete(@RequestBody Long[] ids){
        userService.batchDelete(ids);
        return MessageUtil.success("删除成功");
    }
}
