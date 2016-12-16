/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.facade.convert;

import com.itehl.service.model.entity.Topic;
import com.itehl.education.schema.topicstype.v1.TopicsType;
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
public class TopicConvert {

    public static Topic TypeConvertToEntity(TopicsType requestParam) {

        Topic topicTb = new Topic();

        topicTb.setGuid(Integer.parseInt(requestParam.getGuid()));
        topicTb.setUserguid(requestParam.getUserGuid());
        topicTb.setName(requestParam.getName());
        topicTb.setDescription(requestParam.getDescription());
        topicTb.setStatus(requestParam.isStatus());
      //  topicTb.setCreatedate(requestParam.getCreateDate());
        topicTb.setCreateby(requestParam.getCreatedBy());
       // topicTb.setUpdatedate(requestParam.getUpdatedDate());
        topicTb.setUpdateby(requestParam.getUpdatedBy());

        return topicTb;

    }

    public static TopicsType EntityConvertToType(Topic requestParam) {

        TopicsType topicsType = new TopicsType();

        topicsType.setGuid(Integer.toString(requestParam.getGuid()));
        topicsType.setUserGuid(requestParam.getUserguid());
        topicsType.setName(requestParam.getName());
        topicsType.setDescription(requestParam.getDescription());
        topicsType.setStatus(requestParam.getStatus());
       // topicsType.setCreateDate(requestParam.getCreatedate());
        topicsType.setCreatedBy(requestParam.getCreateby());
        //topicsType.setUpdatedDate(requestParam.getUpdatedate());
        topicsType.setUpdatedBy(requestParam.getUpdateby());

        return topicsType;

    }

    public static List<Topic> TypeConvertToEntityList(List<TopicsType> requestParam) {

        List<Topic> listEnity = new ArrayList<Topic>();
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

    public static List<TopicsType> EntityConvertToTypeList(List<Topic> requestParam) {

        List<TopicsType> listCourse = new ArrayList<TopicsType>();
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
