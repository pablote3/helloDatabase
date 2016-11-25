package com.rossotti.services;

import com.rossotti.domain.Team;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface TeamService extends CrudService<Team> {
	Team findByTeamKey(String teamKey);
	Team findByTeamKeyAndDate(String teamKey, LocalDate date);
}