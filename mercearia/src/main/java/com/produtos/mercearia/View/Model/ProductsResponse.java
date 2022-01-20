package com.produtos.mercearia.View.Model;

import java.util.Date;

import com.produtos.mercearia.Model.Products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsResponse {

    private Long id;
    private String name;
    private Date validity;
    private Long quantity;

    public ProductsResponse(Products products){

        this.setId(products.getId());
        this.setName(products.getName());
        this.setQuantity(products.getQuantity());
        this.setValidity(products.getValidity());


    }
}
