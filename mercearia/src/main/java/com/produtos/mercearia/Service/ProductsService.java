package com.produtos.mercearia.Service;

import com.produtos.mercearia.Model.Products;
import com.produtos.mercearia.Model.Storage;
import com.produtos.mercearia.Repository.ProductsRepository;
import com.produtos.mercearia.Repository.StorageRepository;
import com.produtos.mercearia.Shared.ProductsDto;
import com.produtos.mercearia.View.Model.ProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private StorageRepository storageRepository;


    public ProductsResponse byId(Long id) {

        Products products = productsRepository.findById(id).orElse(null);
        ProductsResponse response = new ProductsResponse(products);

        return response;
    }
    
    public ProductsResponse register(ProductsDto productsDto, Long id) {

        Storage storage = storageRepository.findById(id).orElse(null);

        Products products = new Products(productsDto);
        products.setStorage(storage);

        productsRepository.save(products);
        ProductsResponse response = new ProductsResponse(products);

        return response;
    }

    public ProductsResponse modify(Long id, ProductsDto productsDto) {

        productsDto.setId(null);
        Products products = productsRepository.findById(id).orElse(null);

        ProductsResponse response = new ProductsResponse(products);
        productsRepository.save(products);

        return response;
    }

    public void delete(Long id) {
        productsRepository.deleteById(id);

    }

}
