package com.example.pro_sky_dz3_4.controller;

import com.example.pro_sky_dz3_4.model.Recipe;
import com.example.pro_sky_dz3_4.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")

public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecice(recipe);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeInfo(@PathVariable Long id) {
        Recipe recipe = recipeService.findRecice(id);
        if (recipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recipe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> editRecipe(@PathVariable Long id,
                                             @RequestBody Recipe recipe) {
        Recipe foundRecipe = recipeService.editRecice(id, recipe);
        if (foundRecipe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foundRecipe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {
        recipeService.removeRecice(id);
        return ResponseEntity.ok().build();
    }
}
