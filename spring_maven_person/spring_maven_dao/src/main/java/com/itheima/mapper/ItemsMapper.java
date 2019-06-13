package com.itheima.mapper;




import com.itheima.domain.Items;

import java.util.List;

public interface ItemsMapper {
    List<Items> findAll();

    Items findById(int id);
}


