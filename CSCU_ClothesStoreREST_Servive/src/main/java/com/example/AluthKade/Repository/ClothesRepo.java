package com.example.CSCU_ClothesStore.Repository;

import com.example.CSCU_ClothesStore.Entity.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepo extends JpaRepository<Clothes, Long> {

}
