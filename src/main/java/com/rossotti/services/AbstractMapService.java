package com.rossotti.services;

import com.rossotti.domain.DomainObject;

import java.util.*;

public abstract class AbstractMapService {
    protected Map<Long, DomainObject> domainMap;

    public AbstractMapService() {
        domainMap = new HashMap<>();
    }

    public List<DomainObject> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Long id) {
        return domainMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null){

            if (domainObject.getId() == null){
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);

            return domainObject;
        } else {
            throw new RuntimeException("Object Can't be null");
        }
    }

    public void delete(Long id) {
        domainMap.remove(id);
    }

    private Long getNextKey(){
        return Collections.max(domainMap.keySet()) + 1;
    }

}
