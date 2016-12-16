/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.locator;

import com.itehl.service.facade.EJB.ICourseFacade_ES_EJB;

/**
 *
 * @author bryan.silva
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static ICourseFacade_ES_EJB getService(String jdniName) {
        ICourseFacade_ES_EJB service = cache.getService(jdniName);

        if (service != null) {
            return service;
        }

        InitialContextService context = new InitialContextService();

        ICourseFacade_ES_EJB serviceI = (ICourseFacade_ES_EJB) context.lookUp(jdniName);
        cache.addService(serviceI);
        return serviceI;
    }
}
