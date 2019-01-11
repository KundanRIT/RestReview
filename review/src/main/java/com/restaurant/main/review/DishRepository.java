package com.restaurant.main.review;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends MongoRepository<Dish, String> {
}
