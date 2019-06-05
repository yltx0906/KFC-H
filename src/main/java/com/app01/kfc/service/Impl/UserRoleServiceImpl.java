package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.UserRole;
import com.app01.kfc.bean.UserRoleExample;
import com.app01.kfc.mapper.UserRoleMapper;
import com.app01.kfc.service.IUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> findAll() {
        UserRoleExample example = new UserRoleExample();
        return userRoleMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(UserRole userRole) {
        if(userRole.getId() == null){
            userRoleMapper.insert(userRole);
        }else {
            userRoleMapper.updateByPrimaryKey(userRole);
        }
    }

    @Override
    public void deleteById(Long id) {
        userRoleMapper.deleteByPrimaryKey(id);
    }
}
