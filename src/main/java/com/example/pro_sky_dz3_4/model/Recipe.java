package com.example.pro_sky_dz3_4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Recipe {

    private Long id;

    private String name;

    private String ingredients;

    private String cookingSteps;

}
