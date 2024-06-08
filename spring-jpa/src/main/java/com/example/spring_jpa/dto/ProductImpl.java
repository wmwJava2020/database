/**
 * @author Wondafrash
 * @Date 6/8/2024
 */
package com.example.spring_jpa.dto;

import com.example.spring_jpa.entity.Product;
import com.example.spring_jpa.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Component
public class ProductImpl {

    private ProductRepository repository;
    Product product = new Product();
    public Product saveProductDetails() {
        Product product0 = new Product();

        product0.setProductId(1);
        product0.setProductDescription("Updated_iPhone_Covers ");
        product0.setProductName("APPLE Iphone_0");
        product0.setProductPrice(new BigDecimal(200.75));
        product0.setSku("100-Iphone-2023_0");
        product0.setActive(true);
        product0.setDateCreated(LocalDateTime.now());
        product0.setDateUpdated(LocalDateTime.now());

        Product product1 = new Product();
        product1.setProductId(1);
        product1.setProductDescription("Updated_iPhone_Cases  ");
        product1.setProductName("APPLE Iphone_1");
        product1.setProductPrice(new BigDecimal(300.75));
        product1.setSku("100-Iphone-2023_1");
        product1.setActive(true);
        product1.setDateCreated(LocalDateTime.now());
        product1.setDateUpdated(LocalDateTime.now());

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setProductDescription("Updated_iPhone_Plugins ");
        product2.setProductName("APPLE Iphone_2");
        product2.setProductPrice(new BigDecimal(400.75));
        product2.setSku("100-Iphone-2023_2");
        product2.setActive(true);
        product2.setDateCreated(LocalDateTime.now());
        product2.setDateUpdated(LocalDateTime.now());

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setProductDescription("Updated_iPhone_Batteries");
        product3.setProductName("APPLE Iphone_2");
        product3.setProductPrice(new BigDecimal(450.75));
        product3.setSku("100-Iphone-2023_3");
        product3.setActive(true);
        product3.setDateCreated(LocalDateTime.now());
        product3.setDateUpdated(LocalDateTime.now());

        return (Product) repository.saveAll(List.of(product0, product1, product2, product3));

    }

    public List<Product> getProductDetails() {

        //List<Product>productList = repository.findAll();
        List<Product> productList = repository.findAll();

        for (Product product : productList) {
            System.out.println(product);
        }
       /* System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        productList.forEach(p -> {
            System.out.println("Product_SKU : " + p.getSku() + " :" + " ProductName " + p.getProductName());
        });*/
        return productList;
    }

    public String getProductById(Integer id){
        return product.getProductName();
    }
}
