package com.coolminds.lia.elasticsearch.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.coolminds.lia.elasticsearch.entity.ESItem;
import com.coolminds.lia.elasticsearch.repository.ItemRepository;
import com.coolminds.lia.elasticsearch.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Override
    public ESItem save(ESItem item) {
        ESItem savedItem = itemRepository.save(item);
        return savedItem;
    }

    @Override
    public List<ESItem> getAllItems() {
        Iterable<ESItem> items = itemRepository.findAll();
        List<ESItem> result = new ArrayList<ESItem>();
        items.forEach(result::add);
        return result;
    }

    @Override
    public List<ESItem> searchByName(String name) {
        List<ESItem> searchByName = itemRepository.findByName(name);
        return searchByName;
    }
    
}