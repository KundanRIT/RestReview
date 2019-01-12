package com.restaurant.main.review;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dish")
public class DishController {
    private DishRepository dishRepository;

    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @GetMapping
    public List<Dish> getAll() {
        return this.dishRepository.findAll();
    }

    @GetMapping("/{id}")
    public Dish getById(@PathVariable("id") String id) {
        Optional<Dish> dish = this.dishRepository.findById(id);
        return dish.orElse(null);
    }

    @PostMapping
    public Dish post(Dish dish) {
        return this.dishRepository.insert(dish);
    }

    @PutMapping
    public Dish put(Dish dish) {
        return this.dishRepository.save(dish);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.dishRepository.deleteById(id);
    }
}