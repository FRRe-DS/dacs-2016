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
package ar.edu.utn.frre.dacs.dacs2016.sepa.dao;

import java.util.List;

import ar.edu.utn.frre.dacs.dacs2016.sepa.model.BaseEntity;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
public interface GenericDao<T extends BaseEntity> {

	/**
	 * Persist an Entity in the data store.
	 * @param entity
	 * @return
	 */
	T persist(T entity);
	
	/**
	 * Merge an Entity in the data store.
	 * @param entity
	 */
	void merge(T entity);
	
	/**
	 * Remove an Enity from the data store.
	 * @param entity
	 */
	void remove(T entity);
	
	/**
	 * Finds an Entity by its Id. Null if not found.
	 * @param id
	 * @return
	 */
	T finById(Long id);
	
	/**
	 * Finds all Entities. Empty list if no entities exists.
	 * @return
	 */
	List<T> findAll();
}
