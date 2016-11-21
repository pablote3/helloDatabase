package com.rossotti.services;

import com.rossotti.domain.Team;

import java.util.List;

public interface TeamService extends CrudService<Team> {
	List<Team> findByTeamKey(String teamKey);
}
