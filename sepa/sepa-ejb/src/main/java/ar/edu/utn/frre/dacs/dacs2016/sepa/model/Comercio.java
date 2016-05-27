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
package ar.edu.utn.frre.dacs.dacs2016.sepa.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Entity
@Table(name = "comercio")
public class Comercio extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Properties -------------------------------------------------------------
	
	@NotNull
	@Size(min = 11, max = 11)
	private String cuit;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String razonSocial;

	@NotNull
	@Size(min = 2, max = 50)
	private String denominacionComercial;

	// Getters/Setters --------------------------------------------------------

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDenominacionComercial() {
		return denominacionComercial;
	}

	public void setDenominacionComercial(String denominacionComercial) {
		this.denominacionComercial = denominacionComercial;
	}

	// Overrides --------------------------------------------------------------
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cuit == null) ? 0 : cuit.hashCode());
		result = prime
				* result
				+ ((denominacionComercial == null) ? 0 : denominacionComercial
						.hashCode());
		result = prime * result
				+ ((razonSocial == null) ? 0 : razonSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		if (cuit == null) {
			if (other.cuit != null)
				return false;
		} else if (!cuit.equals(other.cuit))
			return false;
		if (denominacionComercial == null) {
			if (other.denominacionComercial != null)
				return false;
		} else if (!denominacionComercial.equals(other.denominacionComercial))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		return true;
	}
	

}
