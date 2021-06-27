package com.tatsum.Priority.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String name;

    private Order orders;

    private String category;

    private int satisfaction;

    private boolean admin;

    public User(){

    }

    public User(int id, String name, Order orders, String category, int satisfaction, boolean admin) {
        this.id = id;
        this.name = name;
        this.orders = orders;
        this.category = category;
        this.satisfaction = satisfaction;
        this.admin = admin;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
