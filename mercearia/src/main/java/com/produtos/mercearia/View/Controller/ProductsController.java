package com.produtos.mercearia.View.Controller;

import com.produtos.mercearia.Service.ProductsService;
import com.produtos.mercearia.Service.StorageService;
import com.produtos.mercearia.Shared.ProductsDto;
import com.produtos.mercearia.View.Model.ProductsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market/v1/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @Autowired
    StorageService storageService;

    @GetMapping("/{id}")
    public ResponseEntity<?> byId(@PathVariable Long id) {

        ProductsResponse response = productsService.byId(id);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/{id}/storage")
    public ResponseEntity<?> register(@RequestBody ProductsDto productsDto, @PathVariable Long id) {

        ProductsResponse response = productsService.register(productsDto, id);

        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@RequestBody ProductsDto productsDto,@PathVariable Long id){

        ProductsResponse response = productsService.modify(id, productsDto);

        return ResponseEntity.ok().body(response);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        productsService.delete(id);
        return ResponseEntity.ok().body(id);
    }

}
