package com.app01.kfc.service;

import com.app01.kfc.bean.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void saveOrUpdate(User user);

    void deleteById(Long id);

    void batchDelete(Long[] ids);
}
