package com.smk.bi.ticketing.service;

import com.smk.bi.ticketing.model.Rails;
import com.smk.bi.ticketing.repository.RailsRepository;
import org.springframework.stereotype.Service;

/**
 * // TODO Comment
 */
// Nama Fitrah Elly Firdaus
// NIS 2134664
@Service
public class RailsServiceImpl implements RailsService {

  private RailsRepository railsRepository;
  @Override
  public Rails insertService(Rails rails) {
    return railsRepository.save(rails);
  }
}
