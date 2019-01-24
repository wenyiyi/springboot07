package com.springbootmybatis.service.impl;

import com.springbootmybatis.dao.BaseMapper;
import com.springbootmybatis.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    protected BaseMapper<T> baseMapper;

    @Override
    public void delete(Integer id) {
        baseMapper.delete(id);
    }

    @Override
    public Integer save(T t) {
        return baseMapper.save(t);
    }

    @Override
    public void update(T t) {
        baseMapper.update(t);
    }

    @Override
    public T findById(Integer id) {
        return baseMapper.findById(id);
    }


    @Override
    public List<T> list() {
        return baseMapper.list();
    }
}

