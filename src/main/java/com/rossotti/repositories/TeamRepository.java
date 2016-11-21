package com.rossotti.repositories;

import com.rossotti.domain.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {

	List<Team> findByTeamKey(String teamKey);

}