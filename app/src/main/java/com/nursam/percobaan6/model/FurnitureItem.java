package com.nursam.percobaan6.model;

public class FurnitureItem {
    private String name;
    private String description;
    private int imageResource;

    public FurnitureItem(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
