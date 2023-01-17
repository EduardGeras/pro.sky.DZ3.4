package com.example.pro_sky_dz3_4.service.impl;

import com.example.pro_sky_dz3_4.model.Recipe;
import com.example.pro_sky_dz3_4.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service

public class RecipeServiceImpl implements RecipeService {

    private final HashMap<Long, Recipe> recipes = new HashMap<>();

    private long count = 0;

    @Override
    public Recipe addRepice(Recipe recipe) {
        recipe.setId(count++);
        recipes.put(recipe.getId(), recipe);
        return recipe;
    }

    @Override
    public Recipe findRepice(Long id) {
        return recipes.get(id);
    }
}
