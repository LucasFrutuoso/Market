package com.produtos.mercearia.Service;

import com.produtos.mercearia.Model.Storage;
import com.produtos.mercearia.Repository.StorageRepository;
import com.produtos.mercearia.Shared.StorageDto;
import com.produtos.mercearia.View.Model.StorageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public StorageResponse byId(Long id){

        Storage storage = storageRepository.findById(id).orElse(null);
        StorageResponse response = new StorageResponse(storage);

        return response;
    }

    public StorageResponse register(StorageDto storageDto){

        Storage storage = new Storage(storageDto);
        storageRepository.save(storage);

        StorageResponse response = new StorageResponse(storage);
        return response;
    }

    public StorageResponse modify(StorageDto storageDto, Long id){

            storageDto.setId(null);
        Storage storage = storageRepository.findById(id).orElse(null);

        StorageResponse response = new StorageResponse(storage);
            storageRepository.save(storage);

        return response;
    }

}
