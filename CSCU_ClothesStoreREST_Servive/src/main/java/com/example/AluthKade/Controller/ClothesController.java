package com.example.CSCU_ClothesStore.Controller;

import com.example.CSCU_ClothesStore.Entity.Clothes;
import com.example.CSCU_ClothesStore.Service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/Clothes")
public class ClothesController {

    @Autowired
    ClothesService ClothesService;

    @PostMapping("/add")
    public Clothes addClothes(@RequestBody Clothes Clothes, HttpServletRequest httpServletRequest){
        return ClothesService.addClothes(Clothes);
    }

    @GetMapping("/{id}")
    public Optional<Clothes> getClothes(@PathVariable Long Id){
        return ClothesService.getClothes(Id);
    }

    @GetMapping
    public List<Clothes> getAllClothes(){
        return ClothesService.getAllClothes();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClothes(@PathVariable Long Id){
        ClothesService.deleteClothes(Id);
    }
}
