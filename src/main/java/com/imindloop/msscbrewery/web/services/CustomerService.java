package com.imindloop.msscbrewery.web.services;

import com.imindloop.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO createCustomer(CustomerDTO customerDto);

    void updateCustomerById(UUID customerId, CustomerDTO customerDto);

    void deleteCustomerById(UUID beerId);
}
