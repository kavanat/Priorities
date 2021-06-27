package com.tatsum.Priority.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    private int id;
    private String category;

    public Category(){

    }
    public Category(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public Category(String category, int id) {
        this.id = id;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
