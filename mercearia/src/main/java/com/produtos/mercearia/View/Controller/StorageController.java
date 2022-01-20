package com.produtos.mercearia.View.Controller;

import com.produtos.mercearia.Service.StorageService;
import com.produtos.mercearia.Shared.StorageDto;
import com.produtos.mercearia.View.Model.StorageResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market/v1/storage")
public class StorageController {

    @Autowired
    StorageService storageService;

    @GetMapping("/{id}")
    public ResponseEntity<?> byId(@PathVariable Long id) {

        StorageResponse response = storageService.byId(id);

        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<?> register(@RequestBody StorageDto storageDto){

        StorageResponse response = storageService.register(storageDto);

        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modify(@PathVariable Long id, @RequestBody StorageDto storageDto){

        StorageResponse response = storageService.modify(storageDto, id);

        return ResponseEntity.ok().body(response);
    }

}
