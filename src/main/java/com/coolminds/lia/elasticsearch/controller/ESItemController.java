package com.coolminds.lia.elasticsearch.controller;

import java.util.List;

import com.coolminds.lia.elasticsearch.entity.ESItem;
import com.coolminds.lia.elasticsearch.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/esItem")
public class ESItemController {

    @Autowired
    ItemService itemService;

	@PostMapping(path = "/save")
	public String saveItem(@RequestBody ESItem item) {
		itemService.save(item);
		return "Successfully saved item";
	}

	@GetMapping(path = "/allItems")
    public List<ESItem> getAllItems() {
		List<ESItem> items = itemService.getAllItems();
		return items;
	}


	@GetMapping(path = "/search/{name}")
    public List<ESItem> searchByName(@RequestParam ("name") String name) {
		List<ESItem> searchByName = itemService.searchByName(name);
		return searchByName;
	}
}