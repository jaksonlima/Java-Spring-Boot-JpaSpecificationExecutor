package jpa.data.specification.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import jpa.data.specification.entity.User;

public interface ItemRepository extends JpaRepository<User, UUID> , JpaSpecificationExecutor<User> { 
}
