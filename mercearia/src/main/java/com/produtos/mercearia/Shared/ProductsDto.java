package com.produtos.mercearia.Shared;

import java.util.Date;

import com.produtos.mercearia.View.Model.ProductsResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {
    
    private Long id;
    private String name;
    private Date validity;
    private Long quantity;

    public ProductsDto(ProductsResponse productsResponse){
        
        this.setId(productsResponse.getId());
        this.setName(productsResponse.getName());
        this.setQuantity(productsResponse.getQuantity());
        this.setValidity(productsResponse.getValidity());
        
    }
}
