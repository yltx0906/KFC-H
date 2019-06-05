package com.app01.kfc.web.controller;

import com.app01.kfc.bean.Role;
import com.app01.kfc.service.IRoleService;
import com.app01.kfc.utils.Message;
import com.app01.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping("findAll")
    private Message findAll(){
        List<Role> list = roleService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Role role){
        roleService.saveOrUpdate(role);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message saveOrUpdate(Long id){
        roleService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
