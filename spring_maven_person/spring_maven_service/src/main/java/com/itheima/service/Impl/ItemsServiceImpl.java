package com.itheima.service.Impl;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemsMapper;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> findAll() {
        List<Items> itemsList = itemsMapper.findAll();
        return itemsList;
    }

    public Items findById(int id) {
        Items items = itemsMapper.findById(id);
        return items;
    }


}
