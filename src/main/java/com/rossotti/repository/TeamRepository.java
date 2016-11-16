package com.rossotti.repository;

import com.rossotti.domain.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
