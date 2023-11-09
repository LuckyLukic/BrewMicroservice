package luca.microservice.brewMicroservices.repositories;

import luca.microservice.brewMicroservices.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
