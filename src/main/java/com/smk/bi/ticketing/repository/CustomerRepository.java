package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * // TODO Comment
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
  List<Customer> findByCustomerName(String customerName);

  List<Customer> findByCustomerEmail(String customerEmail);

  List<Customer> findByCustomerNameAndCustomerEmail(String customerName, String customerEmail);

  List<Customer> findAll();
}
