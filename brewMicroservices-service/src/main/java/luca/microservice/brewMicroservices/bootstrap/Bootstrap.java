package luca.microservice.brewMicroservices.bootstrap;

import luca.microservice.brewMicroservices.Model.BeerStyleEnum;
import luca.microservice.brewMicroservices.entities.Beer;
import luca.microservice.brewMicroservices.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    BeerRepository beerRepository;
    @Override
    public void run(String... args) throws Exception {

        if (beerRepository.count() == 0) {
            loadBeerObjects();
        }
    }

        private void loadBeerObjects () {

            Beer b1 = Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle(BeerStyleEnum.IPA.name())
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .price(new BigDecimal("12.95"))
                    .upc("BEER_1_UPC")
                    .build();

            Beer b2 = Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle(BeerStyleEnum.PALE_ALE.name())
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .price(new BigDecimal("12.95"))
                    .upc("BEER_2_UPC")
                    .build();

            Beer b3 = Beer.builder()
                    .beerName("Pinball Porter")
                    .beerStyle(BeerStyleEnum.PALE_ALE.name())
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .price(new BigDecimal("12.95"))
                    .upc("BEER_3_UPC")
                    .build();

            beerRepository.saveAll(Arrays.asList(b1, b2, b3));


        }
    }
