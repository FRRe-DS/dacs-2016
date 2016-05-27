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
package ar.edu.utn.frre.dacs.dacs2016.sepa.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import ar.edu.utn.frre.dacs.dacs2016.sepa.dao.ProvinciaDao;
import ar.edu.utn.frre.dacs.dacs2016.sepa.model.Provincia;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@ManagedBean
@ViewScoped
public class ProvinciaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Properties -------------------------------------------------------------
	
	private Provincia entity;
	
	private Long id;
	
	// Dependencies -----------------------------------------------------------
	
	@EJB
	private ProvinciaDao provinciaDao;
	
	// Methods ----------------------------------------------------------------
	
	@PostConstruct
	public void init() {
		if(!FacesContext.getCurrentInstance().isPostback()) {
			if(this.id != null) {
				this.entity = provinciaDao.finById(id);
			} else {
				this.entity = new Provincia();		
			}
		}
		
		
	}
	
	public String create() {
		provinciaDao.persist(entity);
		return "index.xhtml?faces-redirect=true";
	}
	
	public String edit() {
		provinciaDao.merge(entity);
		return "index.xhtml?faces-redirect=true";
	}
	
	public void remove(Provincia provincia) {
		provinciaDao.remove(provincia);
	}	
	
	// Getters/Setters --------------------------------------------------------
	
	public List<Provincia> getProvincias() {
		return provinciaDao.findAll();
	}

	public Provincia getEntity() {
		return entity;
	}

	public void setEntity(Provincia entity) {
		this.entity = entity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
