/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.implement;

import com.itehl.service.model.DAO.CourseDAO;
import com.itehl.service.model.entity.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bryan.silva
 */
public class CourseImplement {

    private CourseDAO courseDAO;

    public boolean createCourse(Course entityClass) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            if (entityClass != null) {
                status = courseDAO.createCourse(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public boolean createTopic(Topic entityClass) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            if (entityClass != null) {
                status = courseDAO.createTopic(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public boolean updateCourse(Course entityClass) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            if (entityClass != null) {
                status = courseDAO.updateCourse(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public boolean updateTopic(Topic entityClass) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            if (entityClass != null) {
                status = courseDAO.updateTopic(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public boolean removeTopic(String Guid, String userGuid) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            Topic entityClass = new Topic();
            entityClass.setGuid(Integer.parseInt(Guid));
            entityClass.setUserguid(userGuid);
            if (entityClass != null) {
                status = courseDAO.removeTopic(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public boolean removeCourse(String Guid, String userGuid) {
        courseDAO = new CourseDAO();
        boolean status = false;
        try {
            Course entityClass = new Course();
            entityClass.setGuid(Integer.parseInt(Guid));
            entityClass.setUserguid(userGuid);
            if (entityClass != null) {
                status = courseDAO.removeCourse(entityClass);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return status;
    }

    public List<Course> getCourseById(String Guid) {
        courseDAO = new CourseDAO();
        List<Course> list = new ArrayList<Course>();
        try {
            if (Guid != null) {
                list = courseDAO.getCourseById(Guid);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Topic> getTopicById(String Guid) {
        courseDAO = new CourseDAO();
        List<Topic> list = new ArrayList<Topic>();
        try {
            if (Guid != null) {
                list = courseDAO.getTopicById(Guid);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByUser(String userGuid) {
        courseDAO = new CourseDAO();
        List<Course> list = new ArrayList<Course>();
        try {
            if (userGuid != null) {
                list = courseDAO.getCoursesByUser(userGuid);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByName(String name, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {name, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (name != null) {
                list = courseDAO.getCoursesByName(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByAuthor(String author, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {author, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (author != null) {
                list = courseDAO.getCoursesByAuthor(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByLevel(int level, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {Integer.toString(level), userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (level > 0) {
                list = courseDAO.getCoursesByLevel(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByScore(int score, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {Integer.toString(score), userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (score > 0) {
                list = courseDAO.getCoursesByScore(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByTarget(String target, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {target, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (target != null) {
                list = courseDAO.getCoursesByTarget(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByStatus(boolean status, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {status, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (status != false) {
                list = courseDAO.getCoursesByStatus(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByHours(int hours, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {hours, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (hours > 0) {
                list = courseDAO.getCoursesByHours(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByCategory(String category, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {category, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (category != null) {
                list = courseDAO.getCoursesByCategory(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByReleaseDate(Date releaseDate, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {releaseDate, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (releaseDate != null) {
                list = courseDAO.getCoursesByReleaseDate(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByMode(String mode, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {mode, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (mode != null) {
                list = courseDAO.getCoursesByMode(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getCoursesByPrice(double price, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {price, userguid};
        List<Course> list = new ArrayList<Course>();
        try {
            if (price > 0) {
                list = courseDAO.getCoursesByPrice(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Topic> getTopicsByName(String name, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {name, userguid};
        List<Topic> list = new ArrayList<Topic>();
        try {
            if (name != null) {
                list = courseDAO.getTopicsByName(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Topic> getTopicsByUser(String userGuid) {
        courseDAO = new CourseDAO();
        List<Topic> list = new ArrayList<Topic>();
        try {
            if (userGuid != null) {
                list = courseDAO.getTopicsByUser(userGuid);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Topic> getTopicsByDescription(String description, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {description, userguid};
        List<Topic> list = new ArrayList<Topic>();
        try {
            if (description != null) {
                list = courseDAO.getTopicsByDescription(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Topic> getTopicsByStatus(boolean status, String userguid) {
        courseDAO = new CourseDAO();
        Object[] o = {status, userguid};
        List<Topic> list = new ArrayList<Topic>();
        try {
            if (status != false) {
                list = courseDAO.getTopicsByStatus(o);
            }
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

    public List<Course> getAllCoruses() {
        courseDAO = new CourseDAO();
        List<Course> list = new ArrayList<Course>();
        try {
                list = courseDAO.getAllCourses();
            
        } catch (Exception e) {
            System.out.println("Implement.. Not found!!");
            e.printStackTrace();
        }
        return list;
    }

}
