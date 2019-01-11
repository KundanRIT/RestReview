package com.restaurant.main.review;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document(collection = "menu")
public class Menu {
    private Map<Cuisine, List<String>> dishes = new HashMap<>();

    public Map<Cuisine, List<String>> getDishes() {
        return dishes;
    }

    public void setDishes(Map<Cuisine, List<String>> dishes) {
        this.dishes = dishes;
    }
}