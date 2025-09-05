package com.example.demo.controller;


import com.example.demo.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SellerController {

    @Autowired
    private Seller seller;

    @GetMapping("/say")
    public String getSeller(){
        return seller.showInfoV3();
    }
}
