/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.EJB;

import com.itehl.service.facade.convert.*;
import com.itehl.service.model.implement.CourseImplement;
import com.itehl.service.utils.*;
import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.coursetype.v1.*;
import com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType;
import com.itehl.fwk.schema.commontype.v1.TxStatusType;
import com.itehl.service.model.implement.VademecumImplement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author bryan.silva
 */
@Stateless(name = "vademecumFacade_EJB", mappedName = "ejb/vademecumFacade_EJB")
public class VademecumFacade_ES_EJB implements IVademecumFacade_ES_EJB {

    private VademecumImplement implement;

    @Override
    public com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType getMedicineByCodComercial(
            com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialRequestType requestParam) throws BusinessExceptionMsg {

        implement = new VademecumImplement();

        GetMedicineByCodComercialResponseType type = new GetMedicineByCodComercialResponseType();

//        if (LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).isDebugEnabled()) {
//            LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).debug("getCourseById (" + requestParam.getUserGuid() + ") - start");
//        }
        try {

            type.setVademecum(VademecumConvert.EntityConvertToType(implement.getMedicineByCodComercial(requestParam.getCodComercial())));
                  

//            LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).info("getCourseById (" + requestParam.getGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
//            LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).error("getCourseById (" + requestParam.getGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(VademecumFacade_ES_EJB.class, e));
        }
//        if (LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).isDebugEnabled()) {
//            LoggerUtil.outLogger(VademecumFacade_ES_EJB.class).debug("getCourseById (" + requestParam.getGuid() + ") - end");
//        }
        return type;
    }

}
