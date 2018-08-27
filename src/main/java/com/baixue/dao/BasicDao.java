package com.baixue.dao;

import java.util.List;

public interface BasicDao<T> {
    public void insert(T t);

    public void delete(String id);

    public void update(T t);

    public T selectById(String id);

    public List<T> selectAll();
}
