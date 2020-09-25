package jpa.data.specification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jpa.data.specification.entity.User;
import jpa.data.specification.repository.search.ItemCriteria;
import jpa.data.specification.service.ItemService;

@RestController
@RequestMapping("/user")
public class UserController {
  

  private ItemService itemService;

	@Autowired
	public void ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping
	public List<User> listItems(ItemCriteria criteria) {
		return itemService.getItems(criteria);
	}
}
