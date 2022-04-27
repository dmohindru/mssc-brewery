package dev.dmohindru.msscbrewery.services;

import dev.dmohindru.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
