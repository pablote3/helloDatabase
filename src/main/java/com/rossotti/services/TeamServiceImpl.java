package com.rossotti.services;

import com.rossotti.domain.DomainObject;
import com.rossotti.domain.Team;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamServiceImpl extends AbstractMapService implements TeamService {

	@Override
	public List<DomainObject> listAll() {
		return super.listAll();
	}

	@Override
	public Team getById(Long id) {
		return (Team)super.getById(id);
	}

	@Override
	public void delete(Long id) {
		super.delete(id);
	}

	@Override
	public Team saveOrUpdate(Team domainObject) {
		return (Team)super.saveOrUpdate(domainObject);
	}
}
