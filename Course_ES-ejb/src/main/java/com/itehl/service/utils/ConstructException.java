/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.utils;

import com.itehl.fwk.schema.commontype.v1.BusinessExceptionType;

/**
 *
 * @author bryan.silva
 */
public class ConstructException {

    public static BusinessExceptionType exceptionType(Class<?> exceptionClass, Exception e) {
        BusinessExceptionType exceptionType = new BusinessExceptionType();
//        exceptionType.setClazz(exceptionClass.getName());
        exceptionType.setDetails(e.getMessage());
        exceptionType.setMessage(e.getLocalizedMessage());
//        exceptionType.setStacktrace(e.getStackTrace().toString());
        return exceptionType;
    }

}
