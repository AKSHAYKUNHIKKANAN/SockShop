package com.coolminds.lia.elasticsearch.repository;

import java.util.List;

import com.coolminds.lia.elasticsearch.entity.ESItem;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemRepository extends ElasticsearchRepository<ESItem, Integer>{

    List<ESItem> findByName(String name);
}