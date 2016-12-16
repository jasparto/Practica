/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.convert;

import com.itehl.education.schema.coursetype.v1.CourseType;
import com.itehl.service.model.DTO.CourseDTO;
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

    public static CourseDTO TypeConvertToDTO(CourseType requestParam) {

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setGuid(requestParam.getGuid());
        courseDTO.setUserGuid(requestParam.getUserGuid());
        courseDTO.setName(requestParam.getName());
        courseDTO.setAuthor(requestParam.getAuthor());
        courseDTO.setLevel(requestParam.getLevel());
        courseDTO.setScore(requestParam.getScore());
        courseDTO.setTarget(requestParam.getTarget());
        courseDTO.setStatus(requestParam.isStatus());
        courseDTO.setHours(requestParam.getHours());
        courseDTO.setCategory(requestParam.getCategory());
//        courseDTO.setReleaseDate(requestParam.getReleaseDate());
        courseDTO.setImage(requestParam.getImage());
        courseDTO.setMode(requestParam.getMode());
        courseDTO.setPrice(requestParam.getPrice());
  //      courseDTO.setCreateDate(requestParam.getCreateDate());
        courseDTO.setCreatedBy(requestParam.getCreatedBy());
    //    courseDTO.setUpdatedDate(requestParam.getUpdatedDate());
        courseDTO.setUpdatedBy(requestParam.getUpdatedBy());

        return courseDTO;

    }

    public static CourseType DTOConvertToType(CourseDTO requestParam) {

        CourseType courseType = new CourseType();

        courseType.setGuid(requestParam.getGuid());
        courseType.setUserGuid(requestParam.getUserGuid());
        courseType.setName(requestParam.getName());
        courseType.setAuthor(requestParam.getAuthor());
        courseType.setLevel(requestParam.getLevel());
        courseType.setScore(requestParam.getScore());
        courseType.setTarget(requestParam.getTarget());
        courseType.setStatus(requestParam.getStatus());
        courseType.setHours(requestParam.getHours());
        courseType.setCategory(requestParam.getCategory());
//        courseType.setReleaseDate(requestParam.getReleaseDate());
        courseType.setMode(requestParam.getMode());
        courseType.setPrice(requestParam.getPrice());
  //      courseType.setCreateDate(requestParam.getCreateDate());
        courseType.setCreatedBy(requestParam.getCreatedBy());
    //    courseType.setUpdatedDate(requestParam.getUpdatedDate());
        courseType.setUpdatedBy(requestParam.getUpdatedBy());

        return courseType;

    }

    public static List<CourseDTO> TypeConvertToDTOList(List<CourseType> requestParam) {

        List<CourseDTO> listDTO = new ArrayList<CourseDTO>();
        try {
            for (int i = 0; i < requestParam.size(); i++) {

                listDTO.add(TypeConvertToDTO(requestParam.get(i)));
            }
        } catch (Exception e) {
            System.out.println("Convert Type to DTO Not Found!!");
            e.printStackTrace();
        }

        return listDTO;
    }

    public static List<CourseType> DTOConvertToTypeList(List<CourseDTO> requestParam) {

        List<CourseType> listCourse = new ArrayList<CourseType>();
        try {
            for (int i = 0; i < requestParam.size(); i++) {

                listCourse.add(DTOConvertToType(requestParam.get(i)));
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
