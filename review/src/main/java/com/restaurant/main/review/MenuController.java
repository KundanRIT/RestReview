package com.restaurant.main.review;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    private MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping
    public List<Menu> getAll() {
        return this.menuRepository.findAll();
    }

    @PostMapping
    public void postDish(@RequestParam("cuisine") String cuisine, @RequestParam("dishId") String dishId) {

    }
}
