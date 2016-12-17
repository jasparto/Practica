/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.convert;

import com.itehl.education.schema.vademecumtype.v1.VademecumType;
import com.itehl.service.model.entity.VademecumComercial;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.GregorianCalendar;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Julian
 */
public class VademecumConvert {

    public static VademecumComercial TypeConvertToEntity(VademecumType requestParam) {
        VademecumComercial vademecumComercialEntity = new VademecumComercial();

        vademecumComercialEntity.setCodComercial(requestParam.getCodComercial());
        vademecumComercialEntity.setNombre(requestParam.getNombre());
        vademecumComercialEntity.setCodCum(requestParam.getCodCum());
        vademecumComercialEntity.setFechaElaboracion(requestParam.getFechaElaboracion().toGregorianCalendar().getTime());
        vademecumComercialEntity.setFechaVencimiento(requestParam.getFechaElaboracion().toGregorianCalendar().getTime());

        return vademecumComercialEntity;
    }
    
    public static VademecumType EntityConvertToType(VademecumComercial requestParam) {

        VademecumType vademecumType = new VademecumType();

        vademecumType.setCodComercial(requestParam.getCodComercial());
        vademecumType.setNombre(requestParam.getNombre());
        vademecumType.setCodCum(requestParam.getCodCum());
        
        GregorianCalendar fe = new GregorianCalendar();
        fe.setTime(requestParam.getFechaElaboracion());
        vademecumType.setFechaElaboracion(new XMLGregorianCalendarImpl(fe));
        
        GregorianCalendar fv = new GregorianCalendar();
        fe.setTime(requestParam.getFechaVencimiento());
        vademecumType.setFechaVencimiento(new XMLGregorianCalendarImpl(fv));

        return vademecumType;

    }

}
