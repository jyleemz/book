package com.springboot.book.data.dto;

public class ChangeProductNameDto {

    private Long number;
    private String name;

    public ChangeProductNameDto() {
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

}
