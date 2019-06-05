package com.app01.kfc.service;

import com.app01.kfc.bean.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void saveOrUpdate(Product product);

    void deleteById(Long id);

    void batchDelete(Long[] ids);

}
