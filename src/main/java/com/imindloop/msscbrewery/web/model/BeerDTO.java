package com.imindloop.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.UUID;

// Data: Creates Getters and Setters, equals, and hash code
// NoArgsConstructor:Self Explanatory
// Builder: Implements the Builder Design Pattern (Cool huh!)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {

    @Null
    private UUID id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

}
