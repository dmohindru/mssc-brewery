package dev.dmohindru.msscbrewery.services;

import dev.dmohindru.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDTO);

    void updateCustomer(UUID customerId, CustomerDto customerDTO);

    void deleteById(UUID customerId);

}
