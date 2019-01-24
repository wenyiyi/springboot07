package com.springbootmybatis.dao;

import java.util.List;

//存放常用的公共方法
public interface BaseMapper<T> {
    /**
     * 保存
     */
    Integer save(T t);

    /**
     * 删除
     */
    void delete(Integer id);

    /**
     * 通过id查询
     */
    T findById(Integer id);

    /**
     * 更新
     */
    void update(T t);

    /**
     * 返回所有信息
     */
    List<T> list();
}

