package com.rossotti.repositories;

import com.rossotti.domain.Team;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public interface TeamRepository2 extends Repository<Team, Long> {
	void delete(Long id);

	List<Team> findAll();

	Team findOne(Long id);

	Team save(Team persisted);

//	@Query("SELECT t.fullName FROM Team t where t.teamKey = :teamKey")
//	String findFullNameByTeamKey(@Param("teamKey") String teamKey);

	Team findByTeamKey(String teamKey);

	Team findByTeamKeyAndFromDateBeforeAndToDateAfter(String teamKey, LocalDate fromDate, LocalDate toDate);
}