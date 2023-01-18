package com.example.pro_sky_dz3_4.service.impl;

import com.example.pro_sky_dz3_4.model.Ingredient;
import com.example.pro_sky_dz3_4.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service

public class IngredientServiceImpl implements IngredientService {

    private final HashMap<Long, Ingredient> ingredients = new HashMap<>();

    private long count = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        ingredient.setId(count++);
        ingredients.put(ingredient.getId(), ingredient);
        return ingredient;
    }

    @Override
    public Ingredient findIngredient(Long id) {
        return ingredients.get(id);
    }
}
