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
    public Recipe addRecice(Recipe recipe) {
        recipe.setId(count++);
        recipes.put(recipe.getId(), recipe);
        return recipe;
    }

    @Override
    public Recipe findRecice(Long id) {
        return recipes.get(id);
    }

    @Override
    public Recipe editRecice(Long id, Recipe recipe) {
        if (!recipes.containsKey(id)) {
            return null;
        }
        recipes.put(id, recipe);
        return recipe;
    }

    @Override
    public Recipe removeRecice(Long id) {
        return recipes.remove(id);
    }

}
