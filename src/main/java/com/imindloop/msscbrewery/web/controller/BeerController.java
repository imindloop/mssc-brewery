package com.imindloop.msscbrewery.web.controller;

import com.imindloop.msscbrewery.web.model.BeerDTO;
import com.imindloop.msscbrewery.web.services.BeerService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    /*
     When the parameter path param matches the parameter passed in the function is not necessary to use @PathVariable
     When not, it is mandatory.
     */
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping // This is a POST that creates a new beer..
    //Todo Investigate what does this RequestBody annotation do Which seems to bind the requestbody to the java datatype.
    public ResponseEntity handlePost(@RequestBody BeerDTO beerDto) {

        BeerDTO savedBeerDto = beerService.saveBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.OK);

    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDto) {

        beerService.updateBeer(beerId, beerDto);

        /* This is the preferred way for an update, because basically is just a heads-up that we understood the order
         and performed it.*/
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    //This allows us to specify a status to return instead of doing it on the ResponseEntity
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerId) {
        beerService.deleteById(beerId);
    }


}
