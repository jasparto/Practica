/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.DAO;

import com.itehl.service.persistence.*;
import com.itehl.service.model.entity.*;
import com.itehl.service.utils.*;
import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import java.util.List;

/**
 *
 * @author bryan.silva
 */
public class CourseDAO {

    private IPersistenceCourse iPersistenceCourse = new PersistenceCourse();

    public CourseDAO() {
    }

    public IPersistenceCourse getiPersistenceCourse() {
        return iPersistenceCourse;
    }

    public void setiPersistenceCourse(IPersistenceCourse iPersistenceCourse) {
        this.iPersistenceCourse = iPersistenceCourse;
    }

    public List<Course> getAllCourses() throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser () - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findAll");
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByUser () - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByUser () - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser () - end");
        }
        return list;
    }

    public boolean createCourse(Course entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryInsert(entityClass);
            LoggerUtil.outLogger(CourseDAO.class).info("createCourse (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("createCourse (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - end");
        }
        return status;
    }

    public boolean createTopic(Topic entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryInsert(entityClass);
            LoggerUtil.outLogger(CourseDAO.class).info("createCourse (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("createCourse (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - end");
        }
        return status;
    }

    public boolean updateCourse(Course entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("createCourse (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryUpdate(entityClass);
            LoggerUtil.outLogger(CourseDAO.class).info("updateCourse (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("updateCourse (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("updateCourse (" + entityClass + ") - end");
        }
        return status;
    }

    public boolean updateTopic(Topic entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("updateTopic (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryUpdate(entityClass);
            LoggerUtil.outLogger(CourseDAO.class).info("updateTopic (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("updateTopic (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("updateTopic (" + entityClass + ") - end");
        }
        return status;
    }

    public boolean removeTopic(Topic entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("removeTopic (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryRemove(entityClass, entityClass.getGuid());
            LoggerUtil.outLogger(CourseDAO.class).info("removeTopic (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("removeTopic (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("removeTopic (" + entityClass + ") - end");
        }
        return status;
    }

    public boolean removeCourse(Course entityClass) throws BusinessExceptionMsg {
        boolean status = false;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("removeCourse (" + entityClass + ") - start");
        }
        try {
            status = iPersistenceCourse.createQueryRemove(entityClass, entityClass.getGuid());
            LoggerUtil.outLogger(CourseDAO.class).info("removeCourse (" + entityClass + ") - return Msg = " + status + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("removeCourse (" + entityClass + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("removeCourse (" + entityClass + ") - end");
        }
        return status;
    }

    public List<Course> getCourseById(String Guid) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + Guid + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByGuid", Integer.parseInt(Guid));
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByUser (" + Guid + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByUser (" + Guid + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + Guid + ") - end");
        }
        return list;
    }

    public List<Topic> getTopicById(String Guid) throws BusinessExceptionMsg {
        List<Topic> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + Guid + ") - start");
        }
        try {
            list = (List<Topic>) iPersistenceCourse.createQuery(Topic.class, "Topic.findByGuid", Integer.parseInt(Guid));
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByUser (" + Guid + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByUser (" + Guid + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + Guid + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByUser(String userGuid) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + userGuid + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByUserguid", userGuid);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByUser (" + userGuid + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByUser (" + userGuid + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByUser (" + userGuid + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByName(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByName (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByName", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByName (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByName (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByName (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByAuthor(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByAuthor (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByAuthor", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByAuthor (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByAuthor (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByAuthor (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByLevel(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByLevel (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByLevel", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByLevel (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByLevel (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByLevel (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByScore(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByScore (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByScore", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByScore (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByScore (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByScore (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByTarget(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByTarget (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByTarger", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByTarget (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByTarget (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByTarget (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByStatus(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByStatus (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByStatus", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByStatus (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByStatus (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByStatus (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByHours(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByHours (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByHours", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByHours (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByHours (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByHours (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByCategory(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByCategory (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByCategory", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByCategory (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByCategory (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByCategory (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByReleaseDate(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByReleaseDate (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByReleasedate", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByReleaseDate (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByReleaseDate (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByReleaseDate (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByMode(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByMode (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByModality", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByMode (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByMode (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByMode (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Course> getCoursesByPrice(Object[] o) throws BusinessExceptionMsg {
        List<Course> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByPrice (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Course>) iPersistenceCourse.createQuery(Course.class, "Course.findByPrice", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getCoursesByPrice (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getCoursesByPrice (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getCoursesByPrice (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Topic> getTopicsByName(Object[] o) throws BusinessExceptionMsg {
        List<Topic> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByName (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Topic>) iPersistenceCourse.createQuery(Topic.class, "Topic.findByName", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getTopicsByName (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getTopicsByName (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByName (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Topic> getTopicsByUser(String userGuid) throws BusinessExceptionMsg {
        List<Topic> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByUser (" + userGuid + ") - start");
        }
        try {
            list = (List<Topic>) iPersistenceCourse.createQuery(Topic.class, "Topic.findByUserguid", userGuid);
            LoggerUtil.outLogger(CourseDAO.class).info("getTopicsByUser (" + userGuid + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getTopicsByUser (" + userGuid + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByUser (" + userGuid + ") - end");
        }
        return list;
    }

    public List<Topic> getTopicsByDescription(Object[] o) throws BusinessExceptionMsg {
        List<Topic> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByDescription (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Topic>) iPersistenceCourse.createQuery(Topic.class, "Topic.findByDescription", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getTopicsByDescription (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getTopicsByDescription (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByDescription (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }

    public List<Topic> getTopicsByStatus(Object[] o) throws BusinessExceptionMsg {
        List<Topic> list = null;
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByStatus (" + o[0] + "," + o[1] + ") - start");
        }
        try {
            list = (List<Topic>) iPersistenceCourse.createQuery(Topic.class, "Topic.findByStatus", o);
            LoggerUtil.outLogger(CourseDAO.class).info("getTopicsByStatus (" + o[0] + "," + o[1] + ") - return List = " + list + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseDAO.class).error("getTopicsByStatus (" + o[0] + "," + o[1] + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseDAO.class, e));

        }
        if (LoggerUtil.outLogger(CourseDAO.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseDAO.class).debug("getTopicsByStatus (" + o[0] + "," + o[1] + ") - end");
        }
        return list;
    }
}
