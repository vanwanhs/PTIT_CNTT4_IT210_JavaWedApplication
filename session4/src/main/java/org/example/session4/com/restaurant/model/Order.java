package org.example.session4.com.restaurant.model;

public class Order {
    private int id;
    private String customerName;
    private String dishName;
    private int quantity;
    private double price;
    private boolean available;

    public Order() {
    }

    public Order(int id, String customerName, String dishName, int quantity, double price, boolean available) {
        this.id = id;
        this.customerName = customerName;
        this.dishName = dishName;
        this.quantity = quantity;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", dishName='" + dishName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
