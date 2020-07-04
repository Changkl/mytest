package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    List<Items> list();
    void save(Items items);
}
