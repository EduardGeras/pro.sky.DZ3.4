package com.example.pro_sky_dz3_4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Ingredient {

    private Long id;

    private String name;

    private int quantity;

    private String unitOfMeasurement;

}
