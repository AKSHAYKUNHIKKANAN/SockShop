package com.coolminds.lia.elasticsearch.service;

import java.util.List;

import com.coolminds.lia.elasticsearch.entity.ESItem;

public interface ItemService {

    ESItem save(ESItem item);

    List<ESItem> getAllItems();

    List<ESItem> searchByName(String name);

}