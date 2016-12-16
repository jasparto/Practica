/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.test;


import com.itehl.service.facade.EJB.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;

/**
 *
 * @author bryan.silva
 */
public class Course_ES_Test {

//    ICourseFacade_ES_EJB facade = new CourseFacade_ES_EJB();
//
//    @Test
//    public void createCourse() {
//        try {
//            Date d = new Date(1111, 11, 1);
//            CourseType type = new CourseType();
//
//            type.setUserGuid("UserGuid1");
//            type.setName("Name");
//            type.setAuthor("Author");
//            type.setLevel(5);
//            type.setScore(100);
//            type.setTarget("Target");
//            type.setStatus(true);
//            type.setHours(80);
//            type.setCategory("Category");
//            //type.setReleaseDate(d);
//            type.setImage("Image");
//            type.setMode("Mode");
//            type.setPrice(1.0);
//           // type.setCreateDate(d);
//            type.setCreatedBy("CreatedBy");
//            //type.setUpdatedDate(d);
//            type.setUpdatedBy("UpdateBy");
//
//            CourseTypeMsg courseTypeMsg = new CourseTypeMsg();
//
//            courseTypeMsg.setCourse(type);
//
//            TxStatusType response = facade.createCourse(courseTypeMsg);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void createTopic() {
//        try {
//            Date d = new Date(1111, 11, 1);
//            TopicsType type = new TopicsType();
//
//            type.setGuid("5");
//            type.setUserGuid("UserGuid1");
//            type.setName("Name");
//            type.setDescription("Description");
//            type.setStatus(true);
//            type.setCreateDate(d);
//            type.setCreatedBy("CreatedBy");
//            type.setUpdatedDate(d);
//            type.setUpdatedBy("UpdateBy");
//
//            TopicsTypeMsg topicsTypeMsg = new TopicsTypeMsg();
//
//            topicsTypeMsg.setTopics(type);
//
//            TxStatusType response = courseFacadeWs.createTopic(topicsTypeMsg);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void updateCourse() {
//        try {
//            Date d = new Date(1111, 11, 1);
//            CourseType type = new CourseType();
//
//            type.setGuid("3");
//            type.setUserGuid("UserGuid3");
//            type.setName("SOA");
//            type.setAuthor("Author");
//            type.setLevel(5);
//            type.setScore(100);
//            type.setTarget("Target");
//            type.setStatus(true);
//            type.setHours(80);
//            type.setCategory("Category");
//            type.setReleaseDate(d);
//            type.setImage("Image");
//            type.setMode("Mode");
//            type.setPrice(1.0);
//            type.setCreateDate(d);
//            type.setCreatedBy("CreatedBy");
//            type.setUpdatedDate(d);
//            type.setUpdatedBy("UpdateBy");
//
//            CourseTypeMsg courseTypeMsg = new CourseTypeMsg();
//
//            courseTypeMsg.setCourse(type);
//
//            TxStatusType response = courseFacadeWs.updateCourse(courseTypeMsg);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void updateTopic() {
//        try {
//            Date d = new Date(1111, 11, 1);
//            TopicsType type = new TopicsType();
//
//            type.setGuid("2");
//            type.setUserGuid("UserGuid2");
//            type.setName("Name");
//            type.setDescription("Description");
//            type.setStatus(true);
//            type.setCreateDate(d);
//            type.setCreatedBy("CreatedBy");
//            type.setUpdatedDate(d);
//            type.setUpdatedBy("UpdateBy");
//
//            TopicsTypeMsg topicsTypeMsg = new TopicsTypeMsg();
//            topicsTypeMsg.setTopics(type);
//
//            TxStatusType response = courseFacadeWs.updateTopic(topicsTypeMsg);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//        
//    }
//    
//    @Test
//    public void removeTopic() {
//        try {
//            DeleteTopicsRequestType deleteTopicsRequestType = new DeleteTopicsRequestType();
//
//            deleteTopicsRequestType.setGuid("2");
//            deleteTopicsRequestType.setUserGuid("UserGuid2");
//
//            TxStatusType response = courseFacadeWs.deleteTopic(deleteTopicsRequestType);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void removeCourse() {
//        try {
//            DeleteCourseRequestType courseRequestType = new DeleteCourseRequestType();
//
//            courseRequestType.setGuid("9");
//            courseRequestType.setUserGuid("UserGuid3");
//
//            TxStatusType response = courseFacadeWs.deleteCourse(courseRequestType);
//
//            System.out.println(response.isStatus());
//
//        } catch (Exception e) {
//            System.out.println("Create Course Test not found ");
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void getCourseById() throws BusinessExceptionMsg {
//        try {
//            GetCourseByIdRequestType request = new GetCourseByIdRequestType();
//            request.setGuid("4");
//            request.setUserGuid("UserGuid4");
//
//            GetCourseByIdResponseType response = courseFacadeWs.getCourseById(request);
//
//            System.out.println(response.getCourse().get(0).getName());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getTopicById() throws BusinessExceptionMsg {
//        try {
//            GetTopicByIdRequestType request = new GetTopicByIdRequestType();
//            request.setGuid("1");
//            request.setUserGuid("UserGuid1");
//
//            GetTopicByIdResponseType response = courseFacadeWs.getTopicById(request);
//
//            System.out.println(response.getTopics().get(0).getName());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByUser() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByUserRequestType request = new GetCoursesByUserRequestType();
//            request.setUserGuid("UserGuid3");
//
//            GetCoursesByUserResponseType response = courseFacadeWs.getCoursesByUser(request);
//
//            System.out.println(response.getCourse().get(0).getName());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByName() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByNameRequestType request = new GetCoursesByNameRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setName("Name");
//
//            GetCoursesByNameResponseType response = courseFacadeWs.getCoursesByName(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByAuthor() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByAuthorRequestType request = new GetCoursesByAuthorRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setAuthor("Author");
//
//            GetCoursesByAuthorResponseType response = courseFacadeWs.getCoursesByAuthor(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByLevel() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByLevelRequestType request = new GetCoursesByLevelRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setLevel(5);
//
//            GetCoursesByLevelResponseType response = courseFacadeWs.getCoursesByLevel(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByScore() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByScoreRequestType request = new GetCoursesByScoreRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setScore(100);
//
//            GetCoursesByScoreResponseType response = courseFacadeWs.getCoursesByScore(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByTarget() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByTargetRequestType request = new GetCoursesByTargetRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setTarget("Target");
//
//            GetCoursesByTargetResponseType response = courseFacadeWs.getCoursesByTarget(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByStatus() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByStatusRequestType request = new GetCoursesByStatusRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setStatus(true);
//
//            GetCoursesByStatusResponseType response = courseFacadeWs.getCoursesByStatus(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByHours() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByHoursRequestType request = new GetCoursesByHoursRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setHours(80);
//
//            GetCoursesByHoursResponseType response = courseFacadeWs.getCoursesByHours(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByCategory() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByCategoryRequestType request = new GetCoursesByCategoryRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setCategory("Category");
//
//            GetCoursesByCategoryResponseType response = courseFacadeWs.getCoursesByCategory(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByReleaseDate() throws BusinessExceptionMsg {
//        try {
//            GregorianCalendar gc = new GregorianCalendar(1111, 10, 29);
//            GetCoursesByReleaseDateRequestType request = new GetCoursesByReleaseDateRequestType();
//             DatatypeFactory df = DatatypeFactory.newInstance();
//            XMLGregorianCalendar xmlGregorianCalendar = df.newXMLGregorianCalendar(gc);
//            request.setUserGuid("UserGuid3");
//            request.setReleaseDate(xmlGregorianCalendar);
//
//            GetCoursesByReleaseDateResponseType response = courseFacadeWs.getCoursesByReleaseDate(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByMode() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByModeRequestType request = new GetCoursesByModeRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setMode("Mode");
//
//            GetCoursesByModeResponseType response = courseFacadeWs.getCoursesByMode(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getCoursesByPrice() throws BusinessExceptionMsg {
//        try {
//            GetCoursesByPriceRequestType request = new GetCoursesByPriceRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setPrice(1.0);
//
//            GetCoursesByPriceResponseType response = courseFacadeWs.getCoursesByPrice(request);
//
//            System.out.println(response.getCourse().get(0).getPrice());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getTopicsByName() throws BusinessExceptionMsg {
//        try {
//            GetTopicsByNameRequestType request = new GetTopicsByNameRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setName("Name");
//
//            GetTopicsByNameResponseType response = courseFacadeWs.getTopicsByName(request);
//
//            System.out.println(response.getTopics().get(0).getDescription());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getTopicsByUser() throws BusinessExceptionMsg {
//        try {
//            GetTopicsByUserRequestType request = new GetTopicsByUserRequestType();
//            request.setUserGuid("UserGuid3");
//
//            GetTopicsByUserResponseType response = courseFacadeWs.getTopicsByUser(request);
//
//            System.out.println(response.getTopics().get(0).getDescription());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getTopicsByDescription() throws BusinessExceptionMsg {
//        try {
//            GetTopicsByDescriptionRequestType request = new GetTopicsByDescriptionRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setDescription("Description");
//
//            GetTopicsByDescriptionResponseType response = courseFacadeWs.getTopicsByDescription(request);
//
//            System.out.println(response.getTopics().get(0).getDescription());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    
//    @Test
//    public void getTopicsByStatus() throws BusinessExceptionMsg {
//        try {
//            GetTopicsByStatusRequestType request = new GetTopicsByStatusRequestType();
//            request.setUserGuid("UserGuid3");
//            request.setStatus(true);
//
//            GetTopicsByStatusResponseType response = courseFacadeWs.getTopicsByStatus(request);
//
//            System.out.println(response.getTopics().get(0).getDescription());
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void getAllCourses() throws BusinessExceptionMsg {
//        List<CourseType> courseTypes = new ArrayList<CourseType>();
//        try {
//
//            courseTypes = courseFacadeWs.getAllCourses();
//            for (int i = 0; i < courseTypes.size(); i++) {
//                System.out.println(courseTypes.get(i).getUserGuid());
//            }
//
//        } catch (Exception e) {
//            System.out.println("Get Course by User Test not found");
//            e.printStackTrace();
//        }
//    }
}
