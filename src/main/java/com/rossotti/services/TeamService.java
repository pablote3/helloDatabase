package com.rossotti.services;

import com.rossotti.domain.Team;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface TeamService extends CrudService<Team> {
	Team findByTeamKey(String teamKey);
	Team findByTeamKeyAndDate(String teamKey, LocalDate date);
}