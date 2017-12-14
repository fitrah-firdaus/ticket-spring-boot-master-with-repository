package com.smk.bi.ticketing.controller;

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

  @Autowired
  CustomerService customerService;

  private static final Logger log = Logger.getLogger(CustomerController.class);

  @GetMapping("/getCustomer")
  public List<Customer> findAll(){
    List<Customer> customerList = customerService.findAll();
    log.info(customerList);
    return customerList;
  }

  @PostMapping("/save")
  public Customer saveCustomer(@RequestBody Customer customer) {
    return customerService.insertCustomer(customer);
  }

  @PostMapping("/delete")
  public Map<String,Object> deleteCustomer(@RequestBody Customer customer){
    Map<String,Object> result = new HashMap<>();
    customerService.deleteCustomer(customer);
    result.put("Status","OK");
    result.put("Message","SUCCESS");
    return result;
  }

  @PostMapping("/findById")
  public Customer findById(@RequestBody Customer customer){
    return customerService.findById(customer.getCustomerId());
  }

  @PostMapping("/findByName")
  public List<Customer> findByName(@RequestBody Customer customer){
    return customerService.findByName(customer.getCustomerName());
  }

}
