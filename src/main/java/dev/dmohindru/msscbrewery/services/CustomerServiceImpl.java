package dev.dmohindru.msscbrewery.services;

import dev.dmohindru.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("customerServiceImp")
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John Citizen")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDTO) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDTO) {
        // TODO impl - add real implementation

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer....");

    }
}
