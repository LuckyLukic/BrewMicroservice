package luca.microservice.brewMicroservices.web.service;

import luca.microservice.brewMicroservices.web.Model.BeerDto;

import java.util.UUID;


public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);

}
