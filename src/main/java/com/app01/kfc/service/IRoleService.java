package com.app01.kfc.service;

import com.app01.kfc.bean.Role;

import java.util.List;

public interface IRoleService {

    List<Role> findAll();

    void saveOrUpdate(Role role);

    void deleteById(Long id);

    void batchDelete(Long[] ids);

}
