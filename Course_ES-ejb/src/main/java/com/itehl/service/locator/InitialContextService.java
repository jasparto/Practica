/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.locator;

import com.itehl.service.facade.EJB.CourseFacade_ES_EJB;

/**
 *
 * @author bryan.silva
 */
public class InitialContextService {

    public Object lookUp(String jdniName) {
        Object o = null;
        try {
//            Properties p = new Properties();
//            p.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
//            p.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
//            p.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
//
//            InitialContext ic = new InitialContext(p);

            if (jdniName.equals("ejb/course_Facade_ES_EJB")) {
                o = new CourseFacade_ES_EJB();
            }

        } catch (Exception e) {
            System.out.println("Initial Context Not Found !!");
            e.printStackTrace();
        }
        return o;
    }

}
