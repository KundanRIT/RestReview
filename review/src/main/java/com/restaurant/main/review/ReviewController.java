package com.restaurant.main.review;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping
    public List<Review> getAll() {
        return this.reviewRepository.findAll();
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable("id") String id) {
        Optional<Review> review = this.reviewRepository.findById(id);
        return review.orElse(null);
    }

    @GetMapping("/dish/{dishId}")
    public List<Review> getByDishId(@PathVariable("dishId") String dishId) {
        return this.reviewRepository.findAllByDishId(dishId);
    }

    @PostMapping
    public Review post(Review review) {
        return this.reviewRepository.insert(review);
    }

    @PutMapping
    public Review put(Review review) {
        return this.reviewRepository.save(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.reviewRepository.deleteById(id);
    }
}