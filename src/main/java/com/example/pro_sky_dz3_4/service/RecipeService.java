package com.example.pro_sky_dz3_4.service;

import com.example.pro_sky_dz3_4.model.Recipe;

public interface RecipeService {

    Recipe addRepice(Recipe recipe);

    Recipe findRepice(Long id);
}
