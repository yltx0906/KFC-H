package com.app01.kfc.service;

import com.app01.kfc.bean.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    void saveOrUpdate(Category category);

    void deleteById(Long id);

    void batchDelete(Long[] ids);


}
