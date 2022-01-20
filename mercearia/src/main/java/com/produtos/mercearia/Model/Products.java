package com.produtos.mercearia.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.produtos.mercearia.Shared.ProductsDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date validity;
    private Long quantity;

    @ManyToOne
    private Storage storage;

    public Products(ProductsDto productsDto){
        this.setId(productsDto.getId());
        this.setName(productsDto.getName());
        this.setQuantity(productsDto.getQuantity());
        this.setValidity(productsDto.getValidity());

    }
}
