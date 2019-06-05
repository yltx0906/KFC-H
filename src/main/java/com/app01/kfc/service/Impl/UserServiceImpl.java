package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.User;
import com.app01.kfc.bean.UserExample;
import com.app01.kfc.mapper.UserMapper;
import com.app01.kfc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(User user) {
        if(user.getId() == null){
            userMapper.insert(user);
        }else {
            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public void deleteById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for(long id : ids){
            userMapper.deleteByPrimaryKey(id);
        }

    }
}
