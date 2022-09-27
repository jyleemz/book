package com.springboot.book.data.dto;

public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;

    public ProductResponseDto() {
    }

    public ProductResponseDto(Long number, String name, int price, int stock) {
        this.setNumber(number);
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
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
