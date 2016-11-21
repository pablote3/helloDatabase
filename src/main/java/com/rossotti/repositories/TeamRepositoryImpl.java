package com.rossotti.repositories;

import com.rossotti.domain.Team;
import com.rossotti.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TeamRepositoryImpl implements TeamService {

	private TeamRepository teamRepository;

	@Autowired
	public void setTeamRepository(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
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

	@Override
	public List<Team> findByTeamKey(String teamKey) {
		return teamRepository.findByTeamKey(teamKey);
	}
}
