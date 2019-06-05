package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.Product;
import com.app01.kfc.bean.ProductExample;
import com.app01.kfc.mapper.ProductMapper;
import com.app01.kfc.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Product product) {
        if(product.getId() == null){
            productMapper.insert(product);
        }else {
            productMapper.updateByPrimaryKey(product);
        }
    }

    @Override
    public void deleteById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for(long id : ids){
            productMapper.deleteByPrimaryKey(id);
        }

    }
}
