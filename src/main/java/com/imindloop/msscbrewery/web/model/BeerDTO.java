package com.imindloop.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

// Data: Creates Getters and Setters, equals, and hash code
// NoArgsConstructor:Self Explanatory
// Builder: Implements the Builder Design Pattern (Cool huh!)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    private UUID id;
    private String name;
    private String beerStyle;
    private Long upc;

}
