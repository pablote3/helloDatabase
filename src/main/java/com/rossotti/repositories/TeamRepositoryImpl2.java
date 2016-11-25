package com.rossotti.repositories;

import com.rossotti.domain.Team;
import com.rossotti.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public class TeamRepositoryImpl2 implements TeamService {

	private TeamRepository2 teamRepository;

	@Autowired
	public void setTeamRepository(TeamRepository2 teamRepository) {
		this.teamRepository = teamRepository;
	}

	@Override
	public Team findByTeamKey(String teamKey) {
		return teamRepository.findByTeamKey(teamKey);
	}

	@Override
	public Team findByTeamKeyAndDate(String teamKey, LocalDate date) {
		return teamRepository.findByTeamKeyAndFromDateBeforeAndToDateAfter(teamKey, date.plusDays(1), date.minusDays(1));
	}

	@Override
	public List<?> listAll() {
		return null;
	}

	@Override
	public Team getById(Long id) {
		return null;
	}

	@Override
	public Team saveOrUpdate(Team domainObject) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}
}
