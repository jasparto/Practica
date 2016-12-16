/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.EJB;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.coursetype.v1.*;
import com.itehl.fwk.schema.commontype.v1.TxStatusType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bryan.silva
 */
@Local
public interface ICourseFacade_ES_EJB {
    
    
    public TxStatusType createCourse(CourseTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType createTopic(TopicsTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType createMode(ModeTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType updateCourse(CourseTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType updateTopic(TopicsTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType updateMode(ModeTypeMsg requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType deleteTopic(DeleteTopicsRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType deleteCourse(DeleteCourseRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns com.itehl.fwk.schema.commontype.v1.TxStatusType
     * @throws BusinessExceptionMsg
     */
    public TxStatusType deleteMode(DeleteModeRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCourseByIdResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCourseByIdResponseType getCourseById(GetCourseByIdRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicByIdResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicByIdResponseType getTopicById(GetTopicByIdRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByUserResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByUserResponseType getCoursesByUser(GetCoursesByUserRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByNameResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByNameResponseType getCoursesByName(GetCoursesByNameRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByDescriptionResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByDescriptionResponseType getCoursesByDescription(GetCoursesByDescriptionRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByAuthorResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByAuthorResponseType getCoursesByAuthor(GetCoursesByAuthorRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByLevelResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByLevelResponseType getCoursesByLevel(GetCoursesByLevelRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByScoreResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByScoreResponseType getCoursesByScore(GetCoursesByScoreRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByTargetResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByTargetResponseType getCoursesByTarget(GetCoursesByTargetRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByStatusResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByStatusResponseType getCoursesByStatus(GetCoursesByStatusRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByHoursResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByHoursResponseType getCoursesByHours(GetCoursesByHoursRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByCategoryResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByCategoryResponseType getCoursesByCategory(GetCoursesByCategoryRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByReleaseDateResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByReleaseDateResponseType getCoursesByReleaseDate(GetCoursesByReleaseDateRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByModeResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByModeResponseType getCoursesByMode(GetCoursesByModeRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByPriceResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByPriceResponseType getCoursesByPrice(GetCoursesByPriceRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicsByNameResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicsByNameResponseType getTopicsByName(GetTopicsByNameRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicsByUserResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicsByUserResponseType getTopicsByUser(GetTopicsByUserRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicsByDescriptionResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicsByDescriptionResponseType getTopicsByDescription(GetTopicsByDescriptionRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicsByStatusResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicsByStatusResponseType getTopicsByStatus(GetTopicsByStatusRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetModeByIdResponseType
     * @throws BusinessExceptionMsg
     */
    public GetModeByIdResponseType getModeById(GetModeByIdRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetModeByModeResponseType
     * @throws BusinessExceptionMsg
     */
    public GetModeByModeResponseType getModeByMode(GetModeByModeRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetModeByPriceResponseType
     * @throws BusinessExceptionMsg
     */
    public GetModeByPriceResponseType getModeByPrice(GetModeByPriceRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetTopicsByCourseResponseType
     * @throws BusinessExceptionMsg
     */
    public GetTopicsByCourseResponseType getTopicsByCourse(GetTopicsByCourseRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByReleaseDateResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByReleaseDateResponseType getCoursesByDynamicParams(GetCoursesByDynamicParamsRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCourseByAffiliateResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCourseByAffiliateResponseType getCoursesByAffiliate(GetCoursesByAffiliateRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByClassroomResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByClassroomResponseType getCoursesByClassroom(GetCoursesByClassroomRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByDeliveryResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByDeliveryResponseType getCoursesByDelivery(GetCoursesByDeliveryRequestType requestParam)
            throws BusinessExceptionMsg;

    /**
     *
     * @param requestParam
     * @return returns
     * com.itehl.education.schema.coursetype.v1.GetCoursesByMaterialResponseType
     * @throws BusinessExceptionMsg
     */
    public GetCoursesByMaterialResponseType getCoursesByMaterial(GetCoursesByMaterialRequestType requestParam)
            throws BusinessExceptionMsg;

    public String getName();

    public List<CourseType> getAllCourses()
            throws BusinessExceptionMsg;
}
