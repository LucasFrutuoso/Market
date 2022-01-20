package com.produtos.mercearia.Shared;

import com.produtos.mercearia.View.Model.StorageResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageDto {

    private Long id;
    private String name;
    private String address;

    public StorageDto(StorageResponse storageResponse){
        this.setId(storageResponse.getId());
        this.setAddress(storageResponse.getAddress());
        this.setName(storageResponse.getName());
    }


}
