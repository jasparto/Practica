/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.api.REST;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialRequestType;
import com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType;
import com.itehl.education.schema.vademecumtype.v1.VademecumType;
import com.itehl.service.facade.EJB.IVademecumFacade_ES_EJB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author bryan.silva
 */
@Path("/VademecumES")
@Consumes({"application/json"})
@Produces({"application/json"})
public class Vademecum_ES_REST {

    @EJB(mappedName = "ejb/vademecumFacade_EJB", beanInterface = IVademecumFacade_ES_EJB.class)
    IVademecumFacade_ES_EJB vademecum_Facade_ES_EJB;

    private IVademecumFacade_ES_EJB lookupCourseFacade() {
        try {
            return (IVademecumFacade_ES_EJB) new InitialContext().lookup("java:module/vademecumFacade_EJB");
        } catch (NamingException ex) {
            Logger.getLogger(Vademecum_ES_REST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @GET
    @Path("/getByCodComercial")
    public VademecumType getCourseByCodComercial(
            @QueryParam("codComercial") String codComercial) throws BusinessExceptionMsg {
        vademecum_Facade_ES_EJB = lookupCourseFacade();
        com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialRequestType request = new GetMedicineByCodComercialRequestType();
        request.setCodComercial(codComercial);
        GetMedicineByCodComercialResponseType response = vademecum_Facade_ES_EJB.getMedicineByCodComercial(request);
        return response.getVademecum();
    }

}
