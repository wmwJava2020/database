/**
 * @author Admin01
 * @Date 6/8/2024
 */
package com.example.spring_jpa.service;

import com.example.spring_jpa.entity.Product;
import com.example.spring_jpa.dto.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductImpl repositoryImpl;
    private Product product;

    public Product saveProducts(){
        return repositoryImpl.saveProductDetails();
    }

    public String getProductsById(Integer id){
        return repositoryImpl.getProductById(id);
    }
}
