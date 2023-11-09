package luca.microservice.brewMicroservices.web.controller;

import jakarta.validation.Valid;
import luca.microservice.brewMicroservices.web.Model.BeerDto;
import luca.microservice.brewMicroservices.web.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    BeerService beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity <BeerDto>handlePost(@Valid  @RequestBody BeerDto beerDto){

        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> handleUpdate(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto){

        beerService.updateBeer(beerId, beerDto);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);
    }

}
