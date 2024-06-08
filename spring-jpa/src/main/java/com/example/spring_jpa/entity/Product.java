/**
 * @author Wondafrash
 * @Date 6/3/2024
 */
package com.example.spring_jpa.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "p_name",uniqueConstraints = {
        @UniqueConstraint(name = "skp_unique",
                columnNames = "stoke_keeping_unit"
        )
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    @SequenceGenerator(name = "p_id_generators",allocationSize = 1,initialValue = 1)
    private int productId;
    private String productName;
    private String productDescription;
    @Column(name = "stoke_keeping_unit",nullable = false)
    private String sku;
    private BigDecimal productPrice;
    private boolean isActive;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;

    public Product(){}

    public Product(int productId, String productName, String productDescription, String sku, BigDecimal productPrice, boolean isActive, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.sku = sku;
        this.productPrice = productPrice;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", sku='" + sku + '\'' +
                ", productPrice=" + productPrice +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }
}
