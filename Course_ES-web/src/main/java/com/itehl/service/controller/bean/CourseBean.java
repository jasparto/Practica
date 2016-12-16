/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.controller.bean;

import com.itehl.education.contract.es.courseservice.v1.BusinessExceptionMsg;
import com.itehl.education.schema.coursetype.v1.*;
import com.itehl.fwk.schema.commontype.v1.TxStatusType;
import com.itehl.service.facade.EJB.ICourseFacade_ES_EJB;
import com.itehl.service.model.DTO.CourseDTO;
import com.itehl.service.model.convert.CourseConvert;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.event.FlowEvent;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author bryan.silva
 */
public class CourseBean implements Serializable {

    private List<CourseDTO> courses;
    private List<CourseDTO> filteredCourses;

    private CourseDTO course;
    private CourseDTO selectedCourse;
    private CourseDTO create = new CourseDTO();

    private CourseType courseType;

    @EJB(mappedName = "ejb/courseFacade_EJB", beanInterface = ICourseFacade_ES_EJB.class)
    ICourseFacade_ES_EJB course_Facade_ES_EJB;

    private ICourseFacade_ES_EJB lookupCourseFacade() {
        try {
            return (ICourseFacade_ES_EJB) new InitialContext().lookup("java:module/courseFacade_EJB");
        } catch (NamingException ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public CourseBean() {
        super();
        try {
            courses = readAllCourses(courses);
        } catch (Exception e) {
            System.out.println("Bean.. init not found!");
            e.printStackTrace();
        }
    }

    public void createCourse() throws IOException {
        course_Facade_ES_EJB = lookupCourseFacade();
        CourseTypeMsg courseTypeMsg = new CourseTypeMsg();
        courseType = new CourseType();
        courseType = CourseConvert.DTOConvertToType(create);
        courseTypeMsg.setCourse(courseType);
        try {
            TxStatusType response = course_Facade_ES_EJB.createCourse(courseTypeMsg);
            if (response.isStatus()) {
                course = null;
                ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                ec.redirect("CourseES.xhtml");
            }
        } catch (BusinessExceptionMsg ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCourse() throws IOException {
        try {
            course_Facade_ES_EJB = lookupCourseFacade();

            CourseTypeMsg courseTypeMsg = new CourseTypeMsg();

            courseTypeMsg.setCourse(CourseConvert.DTOConvertToType(course));

            TxStatusType response = course_Facade_ES_EJB.updateCourse(courseTypeMsg);

            if (response.isStatus()) {
                course = null;
                ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());

            }
        } catch (BusinessExceptionMsg ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCourse() throws IOException {
        try {
            course_Facade_ES_EJB = lookupCourseFacade();

            DeleteCourseRequestType courseRequestType = new DeleteCourseRequestType();

            courseRequestType.setGuid(selectedCourse.getGuid());
            courseRequestType.setUserGuid(selectedCourse.getUserGuid());

            TxStatusType response = course_Facade_ES_EJB.deleteCourse(courseRequestType);
            if (response.isStatus()) {
                selectedCourse = null;
                ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());

            }
        } catch (BusinessExceptionMsg ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<CourseDTO> readAllCourses(List<CourseDTO> courses) {
        course_Facade_ES_EJB = lookupCourseFacade();
        courses = new ArrayList<>();
        try {
            courses.addAll(CourseConvert.TypeConvertToDTOList(course_Facade_ES_EJB.getAllCourses()));
        } catch (BusinessExceptionMsg ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }

    public CourseDTO readCourseById() {
        course_Facade_ES_EJB = lookupCourseFacade();
        GetCourseByIdRequestType request = new GetCourseByIdRequestType();
        request.setGuid(selectedCourse.getGuid());
        request.setUserGuid(selectedCourse.getUserGuid());
        try {
            GetCourseByIdResponseType response = course_Facade_ES_EJB.getCourseById(request);
            course = (CourseConvert.TypeConvertToDTO(response.getCourse().get(0)));
        } catch (BusinessExceptionMsg ex) {
            Logger.getLogger(CourseBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return course;
    }

    public List<CourseDTO> getCourses() {
        return courses;
    }

    public List<CourseDTO> getFilteredCourses() {
        return filteredCourses;
    }

    public void setFilteredCourses(List<CourseDTO> filteredCourses) {
        this.filteredCourses = filteredCourses;
    }

    public CourseDTO getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(CourseDTO selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    public CourseDTO getCreate() {
        return create;
    }

    public void setCreate(CourseDTO create) {
        this.create = create;
    }

}
