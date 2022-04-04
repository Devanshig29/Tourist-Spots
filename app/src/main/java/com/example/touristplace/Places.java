package com.example.touristplace;

public class Places {
    private String category;
    private String name,description;
    private int image;

    public Places(String category,String name, String description, int image) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Places{" +
                "category='" + category + '\'' +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
