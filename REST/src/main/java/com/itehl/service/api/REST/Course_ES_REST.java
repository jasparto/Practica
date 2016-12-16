/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.api.REST;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.coursetype.v1.*;
import com.itehl.fwk.schema.commontype.v1.*;
import com.itehl.service.facade.EJB.ICourseFacade_ES_EJB;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author bryan.silva
 */
@Path("/CourseES")
@Consumes({"application/json"})
@Produces({"application/json"})
public class Course_ES_REST {

    @EJB(mappedName = "ejb/courseFacade_EJB", beanInterface = ICourseFacade_ES_EJB.class)
    ICourseFacade_ES_EJB course_Facade_ES_EJB;

    private ICourseFacade_ES_EJB lookupCourseFacade() {
        try {
            return (ICourseFacade_ES_EJB) new InitialContext().lookup("java:module/courseFacade_EJB");
        } catch (NamingException ex) {
            Logger.getLogger(Course_ES_REST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @POST
    @Path("/create")
    public boolean create_Course(CourseType courseType) throws BusinessExceptionMsg {
        course_Facade_ES_EJB = lookupCourseFacade();
        CourseTypeMsg courseTypeMsg = new CourseTypeMsg();
        courseTypeMsg.setCourse(courseType);
        TxStatusType response = course_Facade_ES_EJB.createCourse(courseTypeMsg);
        return response.isStatus();
    }

    @PUT
    @Path("/update")
    public boolean updateCourse(CourseType courseType) throws BusinessExceptionMsg {
        course_Facade_ES_EJB = lookupCourseFacade();
        CourseTypeMsg courseTypeMsg = new CourseTypeMsg();
        courseTypeMsg.setCourse(courseType);
        TxStatusType response = course_Facade_ES_EJB.updateCourse(courseTypeMsg);
        return response.isStatus();
    }

    @DELETE
    @Path("/delete")
    public boolean deleteCourse(
            @QueryParam("id") String id, @QueryParam("user") String user) throws BusinessExceptionMsg {
        course_Facade_ES_EJB = lookupCourseFacade();
        DeleteCourseRequestType courseRequestType = new DeleteCourseRequestType();
        courseRequestType.setGuid(id);
        courseRequestType.setUserGuid(user);
        TxStatusType response = course_Facade_ES_EJB.deleteCourse(courseRequestType);
        return response.isStatus();
    }

    @GET
    @Path("/getById")
    public List<CourseType> getCourseByID(
            @QueryParam("id") String id, @QueryParam("user") String user) throws BusinessExceptionMsg {
        course_Facade_ES_EJB = lookupCourseFacade();
        GetCourseByIdRequestType request = new GetCourseByIdRequestType();
        request.setGuid(id);
        request.setUserGuid(user);
        GetCourseByIdResponseType response = course_Facade_ES_EJB.getCourseById(request);
        return response.getCourse();
    }

    @GET
    @Path("/getAll")
    public List<CourseType> getAllCourses() throws BusinessExceptionMsg {
        course_Facade_ES_EJB = lookupCourseFacade();
        List<CourseType> courses = new ArrayList<>();
        return courses = course_Facade_ES_EJB.getAllCourses();
    }
}
