/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.WS;

import com.itehl.service.model.implement.CourseImplement;
import com.itehl.service.utils.*;
import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.contract.es.courseservice.v1.CourseESInterface;
import com.itehl.education.schema.coursetype.v1.CourseType;
import com.itehl.education.schema.coursetype.v1.*;
import com.itehl.fwk.schema.commontype.v1.TxStatusType;
import com.itehl.service.facade.convert.*;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author bryan.silva
 */
@WebService(serviceName = "CourseES", portName = "CoursePort", endpointInterface = "com.itehl.education.contract.es.courseservice.v1.CourseESInterface", targetNamespace = "http://itehl.com/education/contract/es/courseservice/v1/", wsdlLocation = "META-INF/wsdl/CourseES.wsdl")
@Stateless
public class CourseES implements CourseESInterface {
 private CourseImplement implement;

   @Override
    public TxStatusType createCourse(com.itehl.education.schema.coursetype.v1.CourseTypeMsg requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("createCourse (" + requestParam.getCourse() + ") - start");
        }
        try {
            type.setStatus(implement.createCourse(CourseConvert.TypeConvertToEntity(requestParam.getCourse())));
            LoggerUtil.outLogger(CourseES.class).info("getCoursesByUser (" + requestParam.getCourse() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByUser (" + requestParam.getCourse() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByUser (" + requestParam.getCourse() + ") - end");
        }
        return type;
    }

   @Override
    public TxStatusType createTopic(com.itehl.education.schema.coursetype.v1.TopicsTypeMsg requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("createCourse (" + requestParam.getTopics() + ") - start");
        }
        try {
            type.setStatus(implement.createTopic(TopicConvert.TypeConvertToEntity(requestParam.getTopics())));
            LoggerUtil.outLogger(CourseES.class).info("getCoursesByUser (" + requestParam.getTopics() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByUser (" + requestParam.getTopics() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByUser (" + requestParam.getTopics() + ") - end");
        }
        return type;
    }

    @Override
    public TxStatusType createMode(com.itehl.education.schema.coursetype.v1.ModeTypeMsg requestParam) throws BusinessExceptionMsg {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public TxStatusType updateCourse(com.itehl.education.schema.coursetype.v1.CourseTypeMsg requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("updateCourse (" + requestParam.getCourse() + ") - start");
        }
        try {
            type.setStatus(implement.updateCourse(CourseConvert.TypeConvertToEntity(requestParam.getCourse())));
            LoggerUtil.outLogger(CourseES.class).info("updateCourse (" + requestParam.getCourse() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("updateCourse (" + requestParam.getCourse() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("updateCourse (" + requestParam.getCourse() + ") - end");
        }
        return type;
    }

    @Override
    public TxStatusType updateTopic(com.itehl.education.schema.coursetype.v1.TopicsTypeMsg requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("updateCourse (" + requestParam.getTopics() + ") - start");
        }
        try {
            type.setStatus(implement.updateTopic(TopicConvert.TypeConvertToEntity(requestParam.getTopics())));
            LoggerUtil.outLogger(CourseES.class).info("updateCourse (" + requestParam.getTopics() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("updateCourse (" + requestParam.getTopics() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("updateCourse (" + requestParam.getTopics() + ") - end");
        }
        return type;
    }

    @Override
    public TxStatusType updateMode(com.itehl.education.schema.coursetype.v1.ModeTypeMsg requestParam) throws BusinessExceptionMsg {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public com.itehl.fwk.schema.commontype.v1.TxStatusType deleteTopic(com.itehl.education.schema.coursetype.v1.DeleteTopicsRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("deleteTopic (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - start");
        }
        try {
            type.setStatus(implement.removeTopic(requestParam.getGuid(), requestParam.getUserGuid()));
            LoggerUtil.outLogger(CourseES.class).info("deleteTopic (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("deleteTopic (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("deleteTopic (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public TxStatusType deleteCourse(com.itehl.education.schema.coursetype.v1.DeleteCourseRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        TxStatusType type = new TxStatusType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("deleteCourse (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - start");
        }
        try {
            type.setStatus(implement.removeCourse(requestParam.getGuid(), requestParam.getUserGuid()));
            LoggerUtil.outLogger(CourseES.class).info("deleteCourse (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - return TxStatusType = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("deleteCourse (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("deleteCourse (" + requestParam.getGuid() + " - " + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public TxStatusType deleteMode(com.itehl.education.schema.coursetype.v1.DeleteModeRequestType requestParam) throws BusinessExceptionMsg {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public GetCourseByIdResponseType getCourseById(com.itehl.education.schema.coursetype.v1.GetCourseByIdRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCourseByIdResponseType type = new GetCourseByIdResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCourseById (" + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCourseById(requestParam.getGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCourseById (" + requestParam.getGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCourseById (" + requestParam.getGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCourseById (" + requestParam.getGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetTopicByIdResponseType getTopicById(com.itehl.education.schema.coursetype.v1.GetTopicByIdRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicByIdResponseType type = new GetTopicByIdResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCourseById (" + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getTopics().addAll(TopicConvert.EntityConvertToTypeList(implement.getTopicById(requestParam.getGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCourseById (" + requestParam.getGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCourseById (" + requestParam.getGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCourseById (" + requestParam.getGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByUserResponseType getCoursesByUser(com.itehl.education.schema.coursetype.v1.GetCoursesByUserRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByUserResponseType type = new GetCoursesByUserResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByUser (" + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByUser(requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByUser (" + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByUser (" + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByUser (" + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByNameResponseType getCoursesByName(com.itehl.education.schema.coursetype.v1.GetCoursesByNameRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByNameResponseType type = new GetCoursesByNameResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByName(requestParam.getName(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public com.itehl.education.schema.coursetype.v1.GetCoursesByDescriptionResponseType getCoursesByDescription(com.itehl.education.schema.coursetype.v1.GetCoursesByDescriptionRequestType requestParam) throws BusinessExceptionMsg {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public GetCoursesByAuthorResponseType getCoursesByAuthor(com.itehl.education.schema.coursetype.v1.GetCoursesByAuthorRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByAuthorResponseType type = new GetCoursesByAuthorResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByAuthor (" + requestParam.getAuthor() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByAuthor(requestParam.getAuthor(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByAuthor (" + requestParam.getAuthor() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByAuthor (" + requestParam.getAuthor() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByAuthor (" + requestParam.getAuthor() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByLevelResponseType getCoursesByLevel(com.itehl.education.schema.coursetype.v1.GetCoursesByLevelRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByLevelResponseType type = new GetCoursesByLevelResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByAuthor (" + requestParam.getLevel() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByLevel(requestParam.getLevel(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByAuthor (" + requestParam.getLevel() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByAuthor (" + requestParam.getLevel() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByAuthor (" + requestParam.getLevel() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByScoreResponseType getCoursesByScore(com.itehl.education.schema.coursetype.v1.GetCoursesByScoreRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByScoreResponseType type = new GetCoursesByScoreResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByScore (" + requestParam.getScore() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByScore(requestParam.getScore(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByScore (" + requestParam.getScore() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByScore (" + requestParam.getScore() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByScore (" + requestParam.getScore() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByTargetResponseType getCoursesByTarget(com.itehl.education.schema.coursetype.v1.GetCoursesByTargetRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByTargetResponseType type = new GetCoursesByTargetResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByTarget (" + requestParam.getTarget() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByTarget(requestParam.getTarget(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByTarget (" + requestParam.getTarget() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByTarget (" + requestParam.getTarget() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByTarget (" + requestParam.getTarget() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByStatusResponseType getCoursesByStatus(com.itehl.education.schema.coursetype.v1.GetCoursesByStatusRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByStatusResponseType type = new GetCoursesByStatusResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByTarget (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByStatus(requestParam.isStatus(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByTarget (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByTarget (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByTarget (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByHoursResponseType getCoursesByHours(com.itehl.education.schema.coursetype.v1.GetCoursesByHoursRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByHoursResponseType type = new GetCoursesByHoursResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByHours (" + requestParam.getHours() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByHours(requestParam.getHours(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByHours (" + requestParam.getHours() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByHours (" + requestParam.getHours() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByHours (" + requestParam.getHours() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByCategoryResponseType getCoursesByCategory(com.itehl.education.schema.coursetype.v1.GetCoursesByCategoryRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByCategoryResponseType type = new GetCoursesByCategoryResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByCategory (" + requestParam.getCategory() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByCategory(requestParam.getCategory(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByCategory (" + requestParam.getCategory() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByCategory (" + requestParam.getCategory() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByCategory (" + requestParam.getCategory() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByReleaseDateResponseType getCoursesByReleaseDate(com.itehl.education.schema.coursetype.v1.GetCoursesByReleaseDateRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByReleaseDateResponseType type = new GetCoursesByReleaseDateResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByReleaseDate (" + requestParam.getReleaseDate() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByReleaseDate(requestParam.getReleaseDate().toGregorianCalendar().getTime(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByReleaseDate (" + requestParam.getReleaseDate() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByReleaseDate (" + requestParam.getReleaseDate() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByReleaseDate (" + requestParam.getReleaseDate() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByModeResponseType getCoursesByMode(com.itehl.education.schema.coursetype.v1.GetCoursesByModeRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByModeResponseType type = new GetCoursesByModeResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByMode (" + requestParam.getMode() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByMode(requestParam.getMode(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByMode (" + requestParam.getMode() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByMode (" + requestParam.getMode() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByMode (" + requestParam.getMode() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetCoursesByPriceResponseType getCoursesByPrice(com.itehl.education.schema.coursetype.v1.GetCoursesByPriceRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByPriceResponseType type = new GetCoursesByPriceResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByPrice (" + requestParam.getPrice() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByPrice(requestParam.getPrice(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getCoursesByPrice (" + requestParam.getPrice() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getCoursesByPrice (" + requestParam.getPrice() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getCoursesByPrice (" + requestParam.getPrice() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetTopicsByNameResponseType getTopicsByName(com.itehl.education.schema.coursetype.v1.GetTopicsByNameRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicsByNameResponseType type = new GetTopicsByNameResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getTopics().addAll(TopicConvert.EntityConvertToTypeList(implement.getTopicsByName(requestParam.getName(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getTopicsByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getTopicsByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByName (" + requestParam.getName() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetTopicsByUserResponseType getTopicsByUser(com.itehl.education.schema.coursetype.v1.GetTopicsByUserRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicsByUserResponseType type = new GetTopicsByUserResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByUser (" + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getTopics().addAll(TopicConvert.EntityConvertToTypeList(implement.getTopicsByUser(requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getTopicsByUser (" + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getTopicsByUser (" + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByUser (" + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetTopicsByDescriptionResponseType getTopicsByDescription(com.itehl.education.schema.coursetype.v1.GetTopicsByDescriptionRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicsByDescriptionResponseType type = new GetTopicsByDescriptionResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByName (" + requestParam.getDescription() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getTopics().addAll(TopicConvert.EntityConvertToTypeList(implement.getTopicsByDescription(requestParam.getDescription(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getTopicsByName (" + requestParam.getDescription() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getTopicsByName (" + requestParam.getDescription() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByName (" + requestParam.getDescription() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetTopicsByStatusResponseType getTopicsByStatus(com.itehl.education.schema.coursetype.v1.GetTopicsByStatusRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicsByStatusResponseType type = new GetTopicsByStatusResponseType();
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByStatus (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - start");
        }
        try {

            type.getTopics().addAll(TopicConvert.EntityConvertToTypeList(implement.getTopicsByStatus(requestParam.isStatus(), requestParam.getUserGuid())));

            LoggerUtil.outLogger(CourseES.class).info("getTopicsByStatus (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - return List = " + type + "");
        } catch (Exception e) {
            LoggerUtil.outLogger(CourseES.class).error("getTopicsByStatus (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - error", e);
            throw new BusinessExceptionMsg(e.getMessage(), ConstructException.exceptionType(CourseES.class, e));
        }
        if (LoggerUtil.outLogger(CourseES.class).isDebugEnabled()) {
            LoggerUtil.outLogger(CourseES.class).debug("getTopicsByStatus (" + requestParam.isStatus() + "," + requestParam.getUserGuid() + ") - end");
        }
        return type;
    }

    @Override
    public GetModeByIdResponseType getModeById(com.itehl.education.schema.coursetype.v1.GetModeByIdRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetModeByIdResponseType type = new GetModeByIdResponseType();
        try {
//           type.getGuid().addAll(CourseConvert.EntityConvertToTypeList(implement.getModeById(requestParam.getUserGuid(), Integer.parseInt(requestParam.getGuid()))));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetModeByModeResponseType getModeByMode(com.itehl.education.schema.coursetype.v1.GetModeByModeRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetModeByModeResponseType type = new GetModeByModeResponseType();
        try {
//            type.getGuid().addAll(CourseConvert.EntityConvertToTypeList(implement.getModeByMode(requestParam.getUserGuid(), requestParam.getMode())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetModeByPriceResponseType getModeByPrice(com.itehl.education.schema.coursetype.v1.GetModeByPriceRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetModeByPriceResponseType type = new GetModeByPriceResponseType();
        try {
//            type.getGuid().addAll(CourseConvert.EntityConvertToTypeList(implement.getModeByPrice(requestParam.getUserGuid(), requestParam.getPrice())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetTopicsByCourseResponseType getTopicsByCourse(com.itehl.education.schema.coursetype.v1.GetTopicsByCourseRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetTopicsByCourseResponseType type = new GetTopicsByCourseResponseType();
        try {
            //type.getTopics().addAll(CourseConvert.EntityConvertToTypeList(implement.getTopicsByCourse(requestParam.getUserGuid(), requestParam.getCourse())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetCoursesByReleaseDateResponseType getCoursesByDynamicParams(com.itehl.education.schema.coursetype.v1.GetCoursesByDynamicParamsRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByReleaseDateResponseType type = new GetCoursesByReleaseDateResponseType();
        try {
//            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByDynamicParams(requestParam.getUserGuid())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetCourseByAffiliateResponseType getCoursesByAffiliate(com.itehl.education.schema.coursetype.v1.GetCoursesByAffiliateRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCourseByAffiliateResponseType type = new GetCourseByAffiliateResponseType();
        try {
//            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByAffiliate(requestParam.getUserGuid(), requestParam.getAffiliate())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetCoursesByClassroomResponseType getCoursesByClassroom(com.itehl.education.schema.coursetype.v1.GetCoursesByClassroomRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByClassroomResponseType type = new GetCoursesByClassroomResponseType();
        try {
//            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByClassroom(requestParam.getUserGuid(), requestParam.getClassroom())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetCoursesByDeliveryResponseType getCoursesByDelivery(com.itehl.education.schema.coursetype.v1.GetCoursesByDeliveryRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByDeliveryResponseType type = new GetCoursesByDeliveryResponseType();
        try {
//            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByDelivery(requestParam.getUserGuid(), requestParam.getDelivery())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public GetCoursesByMaterialResponseType getCoursesByMaterial(com.itehl.education.schema.coursetype.v1.GetCoursesByMaterialRequestType requestParam) throws BusinessExceptionMsg {
        implement = new CourseImplement();
        GetCoursesByMaterialResponseType type = new GetCoursesByMaterialResponseType();
        try {
//            type.getCourse().addAll(CourseConvert.EntityConvertToTypeList(implement.getCoursesByMaterial(requestParam.getUserGuid(), requestParam.getMaterial())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }
}
