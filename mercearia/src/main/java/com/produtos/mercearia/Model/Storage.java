package com.produtos.mercearia.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.produtos.mercearia.Shared.StorageDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;

    @OneToMany
    private List<Products> produto;

    public Storage(StorageDto storageDto) {
        this.setId(storageDto.getId());
        this.setAddress(storageDto.getAddress());
        this.setName(storageDto.getName());
    }

}
