package luca.microservice.brewMicroservices.service;

import luca.microservice.brewMicroservices.Model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/vq/beer")
public class BeerService {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById (@PathVariable UUID beerID) {

        return new ResponseEntity<>(BeerDto.builder().build(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveBeer (@RequestBody BeerDto beer) {

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer (@PathVariable UUID beerId, @RequestBody BeerDto beer) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
