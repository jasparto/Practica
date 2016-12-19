/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.EJB;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import javax.ejb.Local;

/**
 *
 * @author bryan.silva
 */
@Local
public interface IVademecumFacade_ES_EJB {
    
    public com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType getMedicineByCodComercial(
            com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialRequestType requestParam)
            throws BusinessExceptionMsg;
}
