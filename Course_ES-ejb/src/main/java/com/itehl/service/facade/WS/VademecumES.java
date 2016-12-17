/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.WS;

import com.itehl.education.contract.es.vademecumservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.coursetype.v1.GetCourseByIdResponseType;
import com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType;
import com.itehl.fwk.schema.commontype.v1.TxStatusType;
import com.itehl.service.facade.convert.VademecumConvert;
import com.itehl.service.model.implement.VademecumImplement;
import com.itehl.service.utils.ConstructException;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author Julian
 */
@WebService(serviceName = "VademecumES", portName = "VademecumPort", endpointInterface = "com.itehl.education.contract.es.vademecumservice.v1.VademecumESInterface", targetNamespace = "http://itehl.com/education/contract/es/vademecumservice/v1/", wsdlLocation = "META-INF/wsdl/VademecumES.wsdl")
@Stateless
public class VademecumES {

    private VademecumImplement implement;

    public com.itehl.fwk.schema.commontype.v1.TxStatusType createMedicine(com.itehl.education.schema.vademecumtype.v1.VademecumTypeMsg requestParam) throws BusinessExceptionMsg {
        implement = new VademecumImplement();
        TxStatusType type = new TxStatusType();
        try {
            type.setStatus(implement.createMedicine(VademecumConvert.TypeConvertToEntity(requestParam.getVademecum())));
        } catch (Exception e) {
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));

        }
        return type;
    }

    public com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialResponseType getMedicineByCodComercial(com.itehl.education.schema.vademecumtype.v1.GetMedicineByCodComercialRequestType requestParam) throws BusinessExceptionMsg {
        implement = new VademecumImplement();
        GetMedicineByCodComercialResponseType type = new GetMedicineByCodComercialResponseType();
        try {
            type.setVademecum(VademecumConvert.EntityConvertToType(implement.getMedicineByCodComercial(requestParam.getCodComercial())));
        } catch (Exception e) {
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        return type;
    }

}
