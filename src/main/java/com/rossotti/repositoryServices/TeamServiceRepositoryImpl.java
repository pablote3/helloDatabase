package com.rossotti.repositoryServices;

import com.rossotti.domain.Team;
import com.rossotti.repository.TeamRepository;
import com.rossotti.services.TeamService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceRepositoryImpl implements TeamService {

	private TeamRepository teamRepository;

	@Autowired
	public void setTeamRepository(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

//	public Team findTeam(String teamKey, LocalDate asOfDate) {
//		Team team = (Team)getSession().createCriteria(Team.class)
//			.add(Restrictions.eq("teamKey", teamKey))
//			.add(Restrictions.le("fromDate", asOfDate))
//			.add(Restrictions.ge("toDate", asOfDate))
//			.uniqueResult();
//		return team;
//	}
//
//	public Team findTeamByLastName(String lastName, LocalDate asOfDate) {
//		Team team = (Team)getSession().createCriteria(Team.class)
//				.add(Restrictions.eq("lastName", lastName))
//				.add(Restrictions.le("fromDate", asOfDate))
//				.add(Restrictions.ge("toDate", asOfDate))
//				.uniqueResult();
//		return team;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Team> findTeams(LocalDate asOfDate) {
//		List<Team> teams = getSession().createCriteria(Team.class)
//			.add(Restrictions.le("fromDate", asOfDate))
//			.add(Restrictions.ge("toDate", asOfDate))
//			.list();
//		if (teams == null) {
//			teams = new ArrayList<Team>();
//		}
//		return teams;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<Team> findTeams(String teamKey) {
//		List<Team> teams = getSession().createCriteria(Team.class)
//			.add(Restrictions.eq("teamKey", teamKey))
//			.list();
//		if (teams == null) {
//			teams = new ArrayList<Team>();
//		}
//		return teams;
//	}

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
	public void delete(Long id) {
		teamRepository.delete(id);
	}

	@Override
	public Team saveOrUpdate(Team team) {
		return teamRepository.save(team);
	}
}
