package com.restaurant.main.review;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<Menu, String> {
}
