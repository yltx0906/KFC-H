package com.app01.kfc.service.Impl;

import com.app01.kfc.bean.Category;
import com.app01.kfc.bean.CategoryExample;
import com.app01.kfc.mapper.CategoryMapper;
import com.app01.kfc.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Category category) {
        if(category.getId() == null){
            //保存
            categoryMapper.insert(category);
        }else {
            //通过id来修改
            categoryMapper.updateByPrimaryKey(category);
        }
    }

    @Override
    public void deleteById(Long id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for(long id : ids){
            categoryMapper.deleteByPrimaryKey(id);
        }

    }
}
