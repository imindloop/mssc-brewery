package com.imindloop.msscbrewery.web.mappers;

import com.imindloop.msscbrewery.domain.Beer;
import com.imindloop.msscbrewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);
    Beer beerDTOToBeer(BeerDTO beerDTO);
}
