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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.edu.utn.frre.dacs.dacs2016.sepa.model.constraints.EAN13;

/**
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Entity
@Table(name = "producto")
public class Producto extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Properties -------------------------------------------------------------
	
	@NotNull
	@EAN13
	private String codigoEAN13;

	@NotNull
	@Enumerated(EnumType.STRING)
	private UnidadMedida um;

	// Getters/Setters --------------------------------------------------------
	
	public String getCodigoEAN13() {
		return codigoEAN13;
	}

	public void setCodigoEAN13(String codigoEAN13) {
		this.codigoEAN13 = codigoEAN13;
	}

	public UnidadMedida getUm() {
		return um;
	}

	public void setUm(UnidadMedida um) {
		this.um = um;
	}

	// Overrides --------------------------------------------------------------
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((codigoEAN13 == null) ? 0 : codigoEAN13.hashCode());
		result = prime * result + ((um == null) ? 0 : um.hashCode());
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
		Producto other = (Producto) obj;
		if (codigoEAN13 == null) {
			if (other.codigoEAN13 != null)
				return false;
		} else if (!codigoEAN13.equals(other.codigoEAN13))
			return false;
		if (um != other.um)
			return false;
		return true;
	}
	
}
