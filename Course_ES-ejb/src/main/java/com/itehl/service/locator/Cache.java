/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.locator;

import com.itehl.service.facade.EJB.ICourseFacade_ES_EJB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryan.silva
 */
public class Cache {

    private List<ICourseFacade_ES_EJB> services;

    public Cache() {
        services = new ArrayList<ICourseFacade_ES_EJB>();
    }

    public ICourseFacade_ES_EJB getService(String serviceName) {

        for (ICourseFacade_ES_EJB service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                return service;
            }
        }
        return null;
    }

    public void addService(ICourseFacade_ES_EJB newService) {
        boolean exist = false;

        for (ICourseFacade_ES_EJB service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exist = true;
            }
        }
        if(!exist){
            services.add(newService);
        }
    }
    
    
}
