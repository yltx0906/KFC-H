package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.Role;
import com.app01.kfc.bean.RoleExample;
import com.app01.kfc.mapper.RoleMapper;
import com.app01.kfc.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        RoleExample example = new RoleExample();
        return roleMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Role role) {
        if(role.getId() == null){
            roleMapper.insert(role);
        }else {
            roleMapper.updateByPrimaryKey(role);
        }
    }

    @Override
    public void deleteById(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for(long id : ids){
            roleMapper.deleteByPrimaryKey(id);
        }

    }
}
