package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Customer;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.JVM)
public class CustomerServiceImplTest {

  @Autowired
  private CustomerService customerService;

  @Test
  public void insertCustomer() throws Exception {
    Customer customer = new Customer();
    customer.setCustomerName("SMK BI");
    customer.setCustomerEmail("smk@smkbi.com");
    customer.setCustomerAddress("BINTARO");
    customer.setCustomerPhoneNumber("4567");
    customer.setIdentityNumber("123456");
    assert (customerService.insertCustomer(customer)
    .getCustomerId() != 0);
  }

  @Test
  public void findByName_SMK_BI() throws Exception {
    assert (customerService.findByName("SMK BI")
    .get(0).getCustomerEmail()
    .equalsIgnoreCase("smk@smkbi.com"));
  }
}
