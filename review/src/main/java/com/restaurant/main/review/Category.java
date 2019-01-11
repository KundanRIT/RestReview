package com.restaurant.main.review;

public enum Category {
    BREAKFAST("Breakfast"),
    DESSERT("Dessert"),
    RICE("Rice"),
    BREADS("Breads"),
    SIDES("Sides"),
    BEVERAGES("Beverages");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
