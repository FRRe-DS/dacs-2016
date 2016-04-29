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
package ar.edu.utn.frre.dacs.rs;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Ejemplo de RESTful Web Service
 * @author Dr. Jorge Eduardo Villaverde
 *
 */
@Path("validateCUIT")
public class CuitWSExample {
	
	@Context
    private UriInfo context;
 
    public CuitWSExample() {
    }
 
    /**
     * Determina si el CUIT es válido o no.
     * @param cuit Número de CUIT a validar.
     * @return OK si el CUIT es válido.
     */
    @GET
    @Path("{cuit}")
    public boolean validate(@PathParam("cuit") Long cuit) {
        return new Random().nextBoolean();
    }
}
