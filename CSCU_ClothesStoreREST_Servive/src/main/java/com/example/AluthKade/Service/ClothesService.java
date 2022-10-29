package com.example.CSCU_ClothesStore.Service;

import com.example.CSCU_ClothesStore.Entity.Clothes;
import com.example.CSCU_ClothesStore.Repository.ClothesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothesService {

    @Autowired
    ClothesRepo ClothesRepo;
    public Clothes addClothes(Clothes Clothes) {
        return ClothesRepo.save(Clothes);
    }

    public void deleteClothes(Long Id) {
        ClothesRepo.deleteById(Id);
    }

    public List<Clothes> getAllClothes() {
        return ClothesRepo.findAll();
    }

    public Optional<Clothes> getClothes(Long id) {
        return ClothesRepo.findById(id);
    }
}
