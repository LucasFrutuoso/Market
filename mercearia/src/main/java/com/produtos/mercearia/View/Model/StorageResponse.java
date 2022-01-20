package com.produtos.mercearia.View.Model;

import com.produtos.mercearia.Model.Storage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageResponse {
    
    private Long id;
    private String address;
    private String name;

    public StorageResponse(Storage storage){
        this.setId(storage.getId());
        this.setAddress(storage.getAddress());
        this.setName(storage.getName());
    }
}
