package com.rossotti.services;

import com.rossotti.domain.Team;
import com.rossotti.repositories.TeamRepository2;
import com.rossotti.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
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
		List<Team> teams = new ArrayList<>();
		teamRepository.findAll().forEach(teams::add);
		return teams;
	}

	@Override
	public Team getById(Long id) {
		return teamRepository.findOne(id);
	}

	@Override
	public Team saveOrUpdate(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public void delete(Long id) {
		teamRepository.delete(id);
	}
}
