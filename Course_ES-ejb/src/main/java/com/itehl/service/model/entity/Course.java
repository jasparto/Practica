/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bryan.silva
 */
@Entity
@Table(name = "course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findByGuid", query = "SELECT c FROM Course c WHERE c.guid = :request"),
    @NamedQuery(name = "Course.findByUserguid", query = "SELECT c FROM Course c WHERE c.userguid = :request"),
    @NamedQuery(name = "Course.findByCompanyguid", query = "SELECT c FROM Course c WHERE c.companyguid = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByName", query = "SELECT c FROM Course c WHERE c.name = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByAuthor", query = "SELECT c FROM Course c WHERE c.author = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByLevel", query = "SELECT c FROM Course c WHERE c.level = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByScore", query = "SELECT c FROM Course c WHERE c.score = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByTarger", query = "SELECT c FROM Course c WHERE c.targer = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByStatus", query = "SELECT c FROM Course c WHERE c.status = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByHours", query = "SELECT c FROM Course c WHERE c.hours = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByCategory", query = "SELECT c FROM Course c WHERE c.category = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByReleasedate", query = "SELECT c FROM Course c WHERE c.releasedate = :request AND c.userguid = :request2" ),
    @NamedQuery(name = "Course.findByImagen", query = "SELECT c FROM Course c WHERE c.imagen = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByModality", query = "SELECT c FROM Course c WHERE c.modality = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByPrice", query = "SELECT c FROM Course c WHERE c.price = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByCreatedate", query = "SELECT c FROM Course c WHERE c.createdate = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByCreateby", query = "SELECT c FROM Course c WHERE c.createby = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByUpdatedate", query = "SELECT c FROM Course c WHERE c.updatedate = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByUpdateby", query = "SELECT c FROM Course c WHERE c.updateby = :request AND c.userguid = :request2"),
    @NamedQuery(name = "Course.findByDynamicparams", query = "SELECT c FROM Course c WHERE c.dynamicparams = :request AND c.userguid = :request2")})
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "guid")
    private Integer guid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "userguid")
    private String userguid;
    @Size(max = 50)
    @Column(name = "companyguid")
    private String companyguid;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @Size(max = 50)
    @Column(name = "author")
    private String author;
    @Size(max = 50)
    @Column(name = "level")
    private String level;
    @Size(max = 50)
    @Column(name = "score")
    private String score;
    @Size(max = 500)
    @Column(name = "targer")
    private String targer;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "hours")
    private Integer hours;
    @Size(max = 50)
    @Column(name = "category")
    private String category;
    @Column(name = "releasedate")
    @Temporal(TemporalType.DATE)
    private Date releasedate;
    @Size(max = 50)
    @Column(name = "imagen")
    private String imagen;
    @Size(max = 50)
    @Column(name = "modality")
    private String modality;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "createdate")
    @Temporal(TemporalType.DATE)
    private Date createdate;
    @Size(max = 50)
    @Column(name = "createby")
    private String createby;
    @Column(name = "updatedate")
    @Temporal(TemporalType.DATE)
    private Date updatedate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "updateby")
    private String updateby;
    @Size(max = 1000)
    @Column(name = "dynamicparams")
    private String dynamicparams;

    public Course() {
    }

    public Course(Integer guid) {
        this.guid = guid;
    }

    public Course(Integer guid, String userguid, String updateby) {
        this.guid = guid;
        this.userguid = userguid;
        this.updateby = updateby;
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getUserguid() {
        return userguid;
    }

    public void setUserguid(String userguid) {
        this.userguid = userguid;
    }

    public String getCompanyguid() {
        return companyguid;
    }

    public void setCompanyguid(String companyguid) {
        this.companyguid = companyguid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTarger() {
        return targer;
    }

    public void setTarger(String targer) {
        this.targer = targer;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public String getDynamicparams() {
        return dynamicparams;
    }

    public void setDynamicparams(String dynamicparams) {
        this.dynamicparams = dynamicparams;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guid != null ? guid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.guid == null && other.guid != null) || (this.guid != null && !this.guid.equals(other.guid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itehl.service.model.entity.Course[ guid=" + guid + " ]";
    }
    
}
