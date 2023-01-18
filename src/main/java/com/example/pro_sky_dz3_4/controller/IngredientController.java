package com.example.pro_sky_dz3_4.controller;

import com.example.pro_sky_dz3_4.model.Ingredient;
import com.example.pro_sky_dz3_4.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")

public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> getIngredientInfo(@PathVariable Long id) {
        Ingredient ingredient = ingredientService.findIngredient(id);
        if (ingredient == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ingredient);
    }
}
