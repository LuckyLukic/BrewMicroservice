package luca.microservice.brewMicroservices.web.mapper;

import luca.microservice.brewMicroservices.domain.Beer;
import luca.microservice.brewMicroservices.web.Model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto (Beer beer);
    Beer beerDtoToBeer (BeerDto beerDto);
}
