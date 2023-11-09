package luca.microservice.brewMicroservices.web.service;

import lombok.extern.slf4j.Slf4j;
import luca.microservice.brewMicroservices.web.Model.BeerDto;
import luca.microservice.brewMicroservices.web.Model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {

            return BeerDto.builder()
                    .id(UUID.randomUUID())
                    .beerName("Galaxy Cat")
                    .beerStyle(BeerStyleEnum.PALE_ALE)
                    .build();
        }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
            return BeerDto.builder()
                    .id(UUID.randomUUID())
                    .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating....");

    }

    @Override
    public void deleteById(UUID beerId) {
            log.debug("Deleting a beer...");

    }
}
