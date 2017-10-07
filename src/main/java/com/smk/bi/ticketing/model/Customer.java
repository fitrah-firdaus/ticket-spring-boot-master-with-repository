package com.smk.bi.ticketing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerId;
  private String customerName;
  private String customerAddress;
  private String customerEmail;
  private String identityNumber;
  private String customerPhoneNumber;

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getIdentityNumber() {
    return identityNumber;
  }

  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customerId=" + customerId +
        ", customerName='" + customerName + '\'' +
        ", customerAddress='" + customerAddress + '\'' +
        ", customerEmail='" + customerEmail + '\'' +
        ", identityNumber='" + identityNumber + '\'' +
        ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
        '}';
  }
}
