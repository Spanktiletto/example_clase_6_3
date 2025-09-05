package com.example.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Seller {
    private String name="Pedro";
    private String store="Radioshack";
    private Product product;

    public Seller(String name, String store, Product product) {
        this.name = name;
        this.store = store;
        this.product = product;
    }

    public Seller(String name, String store) {
        this.name = name;
        this.store = store;
    }

    public void showInfo() {
        System.out.println("showInfo seller: " + this.name + " store " + this.store);
        System.out.println("name product " + this.product.getName() + " price " + this.product.getPrice());
    }

    public void showInfoV2() {
        System.out.println("showInfoV2 seller: " + this.name + " store " + this.store);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seller() {
    }

    public String showInfoV3() {
        String result=" showInfoV2 seller: "  + this.name + " store: " + this.store;

        return result;
    }
}
