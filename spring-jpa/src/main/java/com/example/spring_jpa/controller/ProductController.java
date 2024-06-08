/**
 * @author Admin01
 * @Date 6/8/2024
 */
package com.example.spring_jpa.controller;

import com.example.spring_jpa.dto.ProductImpl;
import com.example.spring_jpa.entity.Product;
import com.example.spring_jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    //@Autowired
    private Product product;
    //@Autowired
    private ProductImpl productImpl;

    private ProductService service;

    @GetMapping("/v1")
    public String getProductById(@RequestParam("id") Integer productId) {
        return service.getProductsById(productId);
    }
}
