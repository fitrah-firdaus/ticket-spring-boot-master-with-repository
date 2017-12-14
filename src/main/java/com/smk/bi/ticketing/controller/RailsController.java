package com.smk.bi.ticketing.controller;

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.model.Rails;
import com.smk.bi.ticketing.service.RailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@RestController
@RequestMapping("/rails")
public class RailsController {

  @Autowired
  RailsService railsService;

  @PostMapping("/save")
  public Rails saveRails(@RequestBody Rails rails) {
    return railsService.insertService(rails);
  }
}
