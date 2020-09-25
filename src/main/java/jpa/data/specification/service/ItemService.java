package jpa.data.specification.service;

import java.util.List;

import jpa.data.specification.entity.User;
import jpa.data.specification.repository.search.ItemCriteria;

public interface ItemService {

  List<User> getItems(ItemCriteria criteria);
  
}
