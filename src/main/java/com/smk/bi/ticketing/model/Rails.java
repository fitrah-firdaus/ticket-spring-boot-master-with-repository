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
@Table(name = "rails")
public class Rails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long RailsId;

  private String railsName;
  private Long capacity;

  public Long getRailsId() {
    return RailsId;
  }

  public void setRailsId(Long railsId) {
    RailsId = railsId;
  }

  public String getRailsName() {
    return railsName;
  }

  public void setRailsName(String railsName) {
    this.railsName = railsName;
  }

  public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }
}
