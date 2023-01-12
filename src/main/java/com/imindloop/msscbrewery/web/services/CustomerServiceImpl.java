package com.imindloop.msscbrewery.web.services;

import com.imindloop.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
            return CustomerDTO.builder()
                    .id(UUID.randomUUID())
                    .name("Adrian.Lopez")
                    .build();
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDto) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDTO customerDto) {
        //Logic to update customer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting customer with id: " + customerId);
    }

}
