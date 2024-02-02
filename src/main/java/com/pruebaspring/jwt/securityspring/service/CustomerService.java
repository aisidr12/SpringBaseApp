package com.pruebaspring.jwt.securityspring.service;

import com.pruebaspring.jwt.securityspring.dto.CustomerDto;
import com.pruebaspring.jwt.securityspring.entity.Customers;
import com.pruebaspring.jwt.securityspring.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<CustomerDto> findAllCustomer() {
        return customerRepository.findAll().stream().map(this::getDto).toList();
    }

    private CustomerDto getDto(Customers customer) {
        return new CustomerDto(customer.getCustomerId(), customer.getFullName(), customer.getEmail(), customer.getNumberCellphone(), customer.getActive(), customer.getPassword());
    }
}