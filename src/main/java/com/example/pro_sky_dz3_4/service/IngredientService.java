package com.example.pro_sky_dz3_4.service;

import com.example.pro_sky_dz3_4.model.Ingredient;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);

    Ingredient findIngredient(Long id);

    Ingredient editIngredient(Long id, Ingredient ingredient);

    Ingredient removeIngredient(Long id);
}
