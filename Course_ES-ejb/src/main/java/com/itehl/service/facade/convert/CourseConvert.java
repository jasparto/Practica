/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.convert;

import com.itehl.service.model.entity.Course;
import com.itehl.education.schema.coursetype.v1.CourseType;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author bryan.silva
 */
public class CourseConvert {

    public static Course TypeConvertToEntity(CourseType requestParam) {

        Course courseEntity = new Course();

        if (requestParam.getGuid() != null) {
            courseEntity.setGuid(Integer.parseInt(requestParam.getGuid()));
        }
        courseEntity.setUserguid(requestParam.getUserGuid());
        courseEntity.setName(requestParam.getName());
        courseEntity.setAuthor(requestParam.getAuthor());
        courseEntity.setLevel(Integer.toString(requestParam.getLevel()));
        courseEntity.setScore(Integer.toString(requestParam.getScore()));
        courseEntity.setTarger(requestParam.getTarget());
        courseEntity.setStatus(requestParam.isStatus());
        courseEntity.setHours(requestParam.getHours());
        courseEntity.setCategory(requestParam.getCategory());
//        courseEntity.setReleasedate(requestParam.getReleaseDate());
        courseEntity.setImagen(requestParam.getImage());
        courseEntity.setModality(requestParam.getMode());
        courseEntity.setPrice(requestParam.getPrice());
  //      courseEntity.setCreatedate(requestParam.getCreateDate());
        courseEntity.setCreateby(requestParam.getCreatedBy());
    //    courseEntity.setUpdatedate(requestParam.getUpdatedDate());
        courseEntity.setUpdateby(requestParam.getUpdatedBy());

        return courseEntity;

    }

    public static CourseType EntityConvertToType(Course requestParam) {

        CourseType courseType = new CourseType();

        courseType.setGuid(Integer.toString(requestParam.getGuid()));
        courseType.setUserGuid(requestParam.getUserguid());
        courseType.setName(requestParam.getName());
        courseType.setAuthor(requestParam.getAuthor());
        courseType.setLevel(Integer.parseInt(requestParam.getLevel()));
        courseType.setScore(Integer.parseInt(requestParam.getScore()));
        courseType.setTarget(requestParam.getTarger());
        courseType.setStatus(requestParam.getStatus());
        courseType.setHours(requestParam.getHours());
        courseType.setCategory(requestParam.getCategory());
//        courseType.setReleaseDate(requestParam.getReleasedate());
        courseType.setMode(requestParam.getModality());
        courseType.setPrice(requestParam.getPrice());
       // courseType.setCreateDate(requestParam.getCreatedate());
        courseType.setCreatedBy(requestParam.getCreateby());
        //courseType.setUpdatedDate(requestParam.getUpdatedate());
        courseType.setUpdatedBy(requestParam.getUpdateby());

        return courseType;

    }

    public static List<Course> TypeConvertToEntityList(List<CourseType> requestParam) {

        List<Course> listEnity = new ArrayList<Course>();
        try {
            for (int i = 0; i < requestParam.size(); i++) {

                listEnity.add(TypeConvertToEntity(requestParam.get(i)));
            }
        } catch (Exception e) {
            System.out.println("Convert Type to Entity Not Found!!");
            e.printStackTrace();
        }

        return listEnity;
    }

    public static List<CourseType> EntityConvertToTypeList(List<Course> requestParam) {

        List<CourseType> listCourse = new ArrayList<CourseType>();
        try {
            for (int i = 0; i < requestParam.size(); i++) {

                listCourse.add(EntityConvertToType(requestParam.get(i)));
            }

        } catch (Exception e) {
            System.out.println("Convert Entity to Type Not Found!!");
            e.printStackTrace();
        }

        return listCourse;
    }

    private static DatatypeFactory df = null;

    static {
        try {
            df = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException dce) {
            throw new IllegalStateException(
                    "Exception while obtaining DatatypeFactory instance", dce);
        }
    }

    static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date date) {
        if (date == null) {
            return null;
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis(date.getTime());
            return df.newXMLGregorianCalendar(gc);
        }
    }
}
