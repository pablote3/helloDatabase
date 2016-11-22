package com.rossotti.repositories;

import com.rossotti.domain.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, Long> {
	@Query("SELECT t FROM Team t where t.teamKey = :teamKey")
	Team findByTeamKey(@Param("teamKey") String teamKey);
}