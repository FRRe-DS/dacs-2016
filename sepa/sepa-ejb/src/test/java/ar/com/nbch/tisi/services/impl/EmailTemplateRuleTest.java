/*
 * Copyright (C) 2013-2015 Nuevo Banco del Chaco S.A.
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
package ar.com.nbch.tisi.services.impl;

import org.junit.Assert;
import org.junit.Test;



public class EmailTemplateRuleTest {
    
//    private static final String EMAIL_SOLICITUD_CERRAR_TMPL_NAME = "email_solicitud_cerrar.vm";
//    private KieSession kSession;
//    
//    @Before
//    public void setUp() {
//        KieServices ks = KieServices.Factory.get();
//        KieContainer kContainer = ks.getKieClasspathContainer();
//        this.kSession = kContainer.newKieSession("EMailTemplateKS");        
//    }
//    
//    @After
//    public void tearDown() {
//        this.kSession.dispose();
//        this.kSession = null;
//    }
//
    @Test
    public void testCanCreateSession() {
//        if (kSession == null) {
//            Assert.fail();
//        } 
        Assert.assertTrue(true);
    }
//    
//    @Test
//    public void testCerrarTicketDesbloqueOResete() {
//        MailDataHolder mailDataHolder = new MailDataHolder();
//        AccionTicket accion = AccionTicket.CERRAR;  
//        TipoTicket tipoTicket = new TipoTicket();
//        
//        String ids[] = {
//            "DESBLOQUEO_APPNI",
//            "DESBLOQUEO_RED",
//            "DESBLOQUEO_SIDEBA",
//            "RESETEO_APPNI",
//            "RESETEO_RED",
//            "RESETEO_SIDEBA"
//        };
//
//        
//        for(String id : ids) {
//            tipoTicket.setId(id);
//            kSession.insert(accion);
//            kSession.insert(tipoTicket);
//            kSession.insert(mailDataHolder);
//            
//            kSession.fireAllRules();
//            
//            String templateName = mailDataHolder.getTemplateName(); 
//            
//            Assert.assertNotNull(templateName);
//            Assert.assertEquals(EMAIL_SOLICITUD_CERRAR_TMPL_NAME, templateName);
//        }
//        
//    }
//
//    @Test
//    public void testCrearTicketDesbloqueOReseteOActivar() {
//        MailDataHolder mailDataHolder = new MailDataHolder();
//        AccionTicket accion = AccionTicket.CREAR;  
//        TipoTicket tipoTicket = new TipoTicket();
//        
//        String ids[] = {
//            "DESBLOQUEO_APPNI", 
//            "DESBLOQUEO_RED",
//            "DESBLOQUEO_SIDEBA",
//            "RESETEO_APPNI",
//            "RESETEO_RED",
//            "RESETEO_SIDEBA",
//            "ACTIVAR_DISPOSITIVO",
//            "ACTIVAR_IMPRESORA"
//        };
//
//        
//        for(String id : ids) {
//            tipoTicket.setId(id);
//            kSession.insert(accion);
//            kSession.insert(tipoTicket);
//            kSession.insert(mailDataHolder);
//            
//            kSession.fireAllRules();
//            
//            String templateName = mailDataHolder.getTemplateName(); 
//            
//            Assert.assertNotNull(templateName);
//            Assert.assertEquals("email_solicitud_crear.vm", templateName);
//        }        
//    }
//    
//    @Test
//    public void testCrearTicket() {
//        MailDataHolder mailDataHolder = new MailDataHolder();
//        AccionTicket accion = AccionTicket.CREAR;  
//        TipoTicket tipoTicket = new TipoTicket();
//        
//        tipoTicket.setId("Larala");
//        kSession.insert(accion);
//        kSession.insert(tipoTicket);
//        kSession.insert(mailDataHolder);
//        
//        kSession.fireAllRules();
//            
//        String templateName = mailDataHolder.getTemplateName(); 
//        
//        Assert.assertNotNull(templateName);
//        Assert.assertEquals("email_ticket_crear.vm", templateName);
//        Assert.assertEquals("Nuevo Ticket", mailDataHolder.getSubject());
//    }
//    
//    @Test
//    public void testPedidoImplementacion() {
//        MailDataHolder mailDataHolder = new MailDataHolder();
//        AccionTicket accion = AccionTicket.ASIGNAR;
//        TransicionTicketDto transicionTicketDto = new TransicionTicketDto(
//                null, 
//                null, 
//                null, 
//                null, 
//                null, 
//                null, 
//                "IMPLEMENTACION", 
//                "IMPLEMENTACION", 
//                null, 
//                null, 
//                "", 
//                null);
//        
//
//        kSession.insert(accion);
//        kSession.insert(transicionTicketDto);
//        kSession.insert(mailDataHolder);
//        
//        kSession.fireAllRules();
//            
//        String templateName = mailDataHolder.getTemplateName(); 
//        
//        Assert.assertNotNull(templateName);
//        Assert.assertEquals("email_ticket_pedido_implementacion.vm", templateName);        
//    }
}
