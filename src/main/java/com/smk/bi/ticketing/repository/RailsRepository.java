package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Rails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * // TODO Comment
 */
public interface RailsRepository extends CrudRepository<Rails, Long> {
  List<Rails> findByName(String railsName);
}
