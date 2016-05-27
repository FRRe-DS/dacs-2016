/*
 * Copyright (C) 2016 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.dacs2016.sepa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import ar.edu.utn.frre.dacs.dacs2016.sepa.dao.GenericDao;
import ar.edu.utn.frre.dacs.dacs2016.sepa.model.BaseEntity;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */

public abstract class GenericDaoImpl<T extends BaseEntity> 
	implements GenericDao<T> {

	// Properties -------------------------------------------------------------
	
	@PersistenceContext
	protected EntityManager em;

	// Overrides --------------------------------------------------------------
	
	@Override
	public T persist(T entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public void merge(T entity) {
		em.merge(entity);
	}

	@Override
	public void remove(T entity) {
		if(!entity.isNew()) {
			T newT = em.find(getEntityClazz(), entity.getId());
			em.refresh(newT);
			em.remove(newT);
		}
	}

	@Override
	public T finById(Long id) {
		return em.find(getEntityClazz(), id);
	}

	@Override
	public List<T> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(getEntityClazz());
		cq.from(getEntityClazz());
		TypedQuery<T> typedQuery = em.createQuery(cq);
		return typedQuery.getResultList();
	}
	
	// Abstract Methods -------------------------------------------------------

	protected abstract Class<T> getEntityClazz();
	
}
