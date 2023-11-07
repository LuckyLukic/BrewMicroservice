package luca.microservice.brewMicroservices.service;

import lombok.extern.slf4j.Slf4j;
import luca.microservice.brewMicroservices.Model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return null;
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating....");

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}
