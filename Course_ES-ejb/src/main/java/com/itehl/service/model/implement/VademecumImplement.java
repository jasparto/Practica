/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.implement;

import com.itehl.service.model.DAO.VademecumComercialDAO;
import com.itehl.service.model.entity.VademecumComercial;

/**
 *
 * @author Julian
 */
public class VademecumImplement {

    private VademecumComercialDAO vademecumComercialDAO;
    
    public boolean createMedicine(VademecumComercial entityClass) {
        vademecumComercialDAO = new VademecumComercialDAO();
        boolean status = false;
        try {
            if (entityClass != null) {
                status = vademecumComercialDAO.createMedicine(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }
    
    public VademecumComercial getMedicineByCodComercial(String codComercial) {
        vademecumComercialDAO = new VademecumComercialDAO();
        VademecumComercial vademecumComercial = new VademecumComercial();
        try {
            if (codComercial != null) {
                vademecumComercial = vademecumComercialDAO.getMedicineByCodComercial(codComercial);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return vademecumComercial;
    }
}
