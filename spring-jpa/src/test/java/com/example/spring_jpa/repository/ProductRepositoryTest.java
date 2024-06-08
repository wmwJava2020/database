package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // this will load full applications
//@DataJpaTest // to test JPA components
class ProductRepositoryTest {
    @Autowired
    private ProductRepository repository;

    @Test
    void saveProductDetails() {
        Product product0 = new Product();

        product0.setProductDescription("Updated_iPhone_Covers ");
        product0.setProductName("APPLE Iphone_0");
        product0.setProductPrice(new BigDecimal(200.75));
        product0.setSku("100-Iphone-2023_0");
        product0.setActive(true);

        Product product1 = new Product();
        product1.setProductDescription("Updated_iPhone_Cases  ");
        product1.setProductName("APPLE Iphone_1");
        product1.setProductPrice(new BigDecimal(300.75));
        product1.setSku("100-Iphone-2023_1");
        product1.setActive(true);

        Product product2 = new Product();
        product2.setProductDescription("Updated_iPhone_Plugins ");
        product2.setProductName("APPLE Iphone_2");
        product2.setProductPrice(new BigDecimal(400.75));
        product2.setSku("100-Iphone-2023_2");
        product2.setActive(true);

        Product product3 = new Product();
        product3.setProductDescription("Updated_iPhone_Batteries");
        product3.setProductName("APPLE Iphone_2");
        product3.setProductPrice(new BigDecimal(450.75));
        product3.setSku("100-Iphone-2023_3");
        product3.setActive(true);

        repository.saveAll(List.of(product0, product1, product2, product3));
    }

    @Test
    void findAllProductDetails() {

        //List<Product>productList = repository.findAll();
        List<Product> productList = repository.findAll();

        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        productList.forEach(p -> {
            System.out.println("Product_SKU : " + p.getSku() + " :" + " ProductName " + p.getProductName());
        });

    }

    // to delete ALL details
    @Test
    void test_Delete_All_Product_Details() {
        repository.deleteAll();
    }

    @Test
    void test_delete_Product_Details_ById() {
        Integer id = 203;
        Product product = repository.findById(id).get();

        repository.delete(product);

    }

    @Test
    void test_Update_Product_Details_ById(){

        Product products = new Product();
        Integer toBe_Update = 305;
        Product productUpdated = repository.findById(toBe_Update).get();

        productUpdated.setSku("Updated_Iphone_1000");
        productUpdated.setProductPrice(new BigDecimal(900));
        productUpdated.setProductName("New_Iphone_2025");
        productUpdated.setProductDescription("Iphone_2025_ProMax");
        productUpdated.setActive(false);

        repository.save(productUpdated);


    }

}