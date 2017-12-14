package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Customer;

import java.util.List;

/**
 * // TODO Comment
 */
public interface CustomerService {

  Customer insertCustomer(Customer customer);
  Customer updateCustomer(Customer customer);
  void deleteCustomer(Customer customer);
  Customer findById(Long id);
  List<Customer> findByName(String name);
  List<Customer> findAll();
}
