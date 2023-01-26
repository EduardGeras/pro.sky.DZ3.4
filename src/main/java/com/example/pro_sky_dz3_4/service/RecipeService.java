package com.example.pro_sky_dz3_4.service;

import com.example.pro_sky_dz3_4.model.Recipe;

public interface RecipeService {

    Recipe addRecice(Recipe recipe);

    Recipe findRecice(Long id);

    Recipe editRecice(Long id, Recipe recipe);

    Recipe removeRecice(Long id);
}
