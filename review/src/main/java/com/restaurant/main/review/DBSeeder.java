package com.restaurant.main.review;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner {
    private MenuRepository menuRepository;
    private ReviewRepository reviewRepository;
    private DishRepository dishRepository;

    public DBSeeder(MenuRepository menuRepository, ReviewRepository reviewRepository, DishRepository dishRepository) {
        this.menuRepository = menuRepository;
        this.reviewRepository = reviewRepository;
        this.dishRepository = dishRepository;
    }


    @Override
    public void run(String... args) throws Exception {
//        this.dishRepository.deleteAll();
//        this.reviewRepository.deleteAll();
//        this.menuRepository.deleteAll();
    }
}
