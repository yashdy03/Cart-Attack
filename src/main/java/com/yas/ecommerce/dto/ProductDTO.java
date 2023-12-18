package com.yas.ecommerce.dto;

import com.yas.ecommerce.model.Category;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class ProductDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int categoryId;
    private double price;
    private String description;
    private String imageName;
}
