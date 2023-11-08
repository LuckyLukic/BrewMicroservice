package luca.microservice.brewMicroservices.repositories;

import luca.microservice.brewMicroservices.entities.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
