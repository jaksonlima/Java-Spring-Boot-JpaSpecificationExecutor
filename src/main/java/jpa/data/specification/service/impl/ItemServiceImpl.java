package jpa.data.specification.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jpa.data.specification.entity.User;
import jpa.data.specification.repository.ItemRepository;
import jpa.data.specification.repository.search.FindAllBuilder;
import jpa.data.specification.repository.search.ItemCriteria;
import jpa.data.specification.service.ItemService;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	private final ItemRepository repository;

	@Autowired
	public ItemServiceImpl(ItemRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<User> getItems(ItemCriteria criteria) {
		// @formatter:off
		return FindAllBuilder
		.usingRepository(repository)
		.filterBy(criteria.getFilter())
		.findAll(criteria.getPage(), criteria.getSize());
		// @formatter:on
	}
}