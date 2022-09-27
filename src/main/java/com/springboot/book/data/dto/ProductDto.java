package com.springboot.book.data.dto;

public class ProductDto {

    private String name;
    private int price;
    private int stock;

    public ProductDto(String name, int price, int stock) {
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
