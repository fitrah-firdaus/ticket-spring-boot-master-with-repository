package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  @Override
  public Customer insertCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public Customer updateCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public void deleteCustomer(Customer customer) {
    customerRepository.delete(customer.getCustomerId());
  }

  @Override
  public Customer findById(Long id) {
    return customerRepository.findOne(id);
  }

  @Override
  public List<Customer> findByName(String name) {
    return customerRepository.findByCustomerName(name);
  }
}
