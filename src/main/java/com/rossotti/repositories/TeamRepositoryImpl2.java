package com.rossotti.repositories;

import com.rossotti.domain.Team;
import com.rossotti.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public class TeamRepositoryImpl2 implements TeamService {

	private TeamRepository2 teamRepository;

	@Autowired
	public void setTeamRepository(TeamRepository2 teamRepository) {
		this.teamRepository = teamRepository;
	}

	@Query("SELECT t.fullName FROM Team t where t.teamKey = :teamKey")
	@Override
	public String findFullNameByTeamKey(String teamKey) {
		return teamRepository.findFullNameByTeamKey(teamKey);
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