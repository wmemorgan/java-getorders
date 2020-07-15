package com.lambdaschool.crudyorders.services;

import com.lambdaschool.crudyorders.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> findAllCustomers();

    Customer findById(long custcode);

    List<Customer> findByNameLike(String likename);

}
