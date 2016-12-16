/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.DAO;

import com.itehl.service.persistence.IPersistenceCourse;
import com.itehl.service.persistence.PersistenceCourse;

/**
 *
 * @author juliano
 */
public class VademecumComercialDAO {

    public VademecumComercialDAO() {
    }

    /**
     * @return the iPersistenceVademecumComercial
     */
    public IPersistenceCourse getiPersistenceVademecumComercial() {
        return iPersistenceVademecumComercial;
    }

    /**
     * @param iPersistenceVademecumComercial the iPersistenceVademecumComercial
     * to set
     */
    public void setiPersistenceVademecumComercial(IPersistenceCourse iPersistenceVademecumComercial) {
        this.iPersistenceVademecumComercial = iPersistenceVademecumComercial;
    }
    private IPersistenceCourse iPersistenceVademecumComercial = new PersistenceCourse();

    
    
}
