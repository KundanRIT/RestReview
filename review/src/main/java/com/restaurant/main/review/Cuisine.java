package com.restaurant.main.review;

public enum Cuisine {

    INDIAN("Indian"),
    CHINESE("Chinese"),
    CONTINENTAL("Continental"),
    THAI("Thai");

    private String category;

    Cuisine(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}