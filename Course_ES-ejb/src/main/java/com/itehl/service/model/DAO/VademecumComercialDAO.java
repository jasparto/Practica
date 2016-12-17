/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.DAO;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.service.model.entity.VademecumComercial;
import com.itehl.service.persistence.IPersistenceCourse;
import com.itehl.service.persistence.PersistenceCourse;
import com.itehl.service.utils.ConstructException;
import java.util.List;

/**
 *
 * @author juliano
 */
public class VademecumComercialDAO {

    private IPersistenceCourse iPersistenceCourse = new PersistenceCourse();

    public VademecumComercialDAO() {
    }

    public boolean createMedicine(VademecumComercial entityClass) throws BusinessExceptionMsg {
        boolean status = false;
//        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
//            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - start");
//        }
        try {
            status = iPersistenceVademecumComercial.createQueryInsert(entityClass);
//            LoggerUtil.outLogger(CourseDAO.class).info("createCourse (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
//            LoggerUtil.outLogger(CourseDAO.class).error("createCourse (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
//        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
//            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - end");
//        }
        return status;
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

    public VademecumComercial getMedicineByCodComercial(String codComercial) throws BusinessExceptionMsg {
        VademecumComercial vademecumComercial = null;
        try {
            List<?> objetList = iPersistenceVademecumComercial.createQuery(VademecumComercial.class, "VademecumComercial.findByCodComercial", codComercial);
            for (Object object : objetList) {
                vademecumComercial = (VademecumComercial) object;
            }
        } catch (Exception e) {
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));
        }
        return vademecumComercial;
    }

}
