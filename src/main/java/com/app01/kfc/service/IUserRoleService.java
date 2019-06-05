package com.app01.kfc.service;

import com.app01.kfc.bean.UserRole;

import java.util.List;

public interface IUserRoleService {

    List<UserRole> findAll();

    void saveOrUpdate(UserRole userRole);

    void deleteById(Long id);


}
