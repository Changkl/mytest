package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> list();

    void save(Items items);
}
