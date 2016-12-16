/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author bryan.silva
 */
@Entity
@Table(name = "topic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Topic.findAll", query = "SELECT t FROM Topic t"),
    @NamedQuery(name = "Topic.findByGuid", query = "SELECT t FROM Topic t WHERE t.guid = :request"),
    @NamedQuery(name = "Topic.findByUserguid", query = "SELECT t FROM Topic t WHERE t.userguid = :request"),
    @NamedQuery(name = "Topic.findByCompanyguid", query = "SELECT t FROM Topic t WHERE t.companyguid = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByName", query = "SELECT t FROM Topic t WHERE t.name = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByDescription", query = "SELECT t FROM Topic t WHERE t.description = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByStatus", query = "SELECT t FROM Topic t WHERE t.status = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByImagen", query = "SELECT t FROM Topic t WHERE t.imagen = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByCreatedate", query = "SELECT t FROM Topic t WHERE t.createdate = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByCreateby", query = "SELECT t FROM Topic t WHERE t.createby = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByUpdatedate", query = "SELECT t FROM Topic t WHERE t.updatedate = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByUpdateby", query = "SELECT t FROM Topic t WHERE t.updateby = :request AND t.userguid = :request2"),
    @NamedQuery(name = "Topic.findByDynamicparams", query = "SELECT t FROM Topic t WHERE t.dynamicparams = :request AND t.userguid = :request2")})
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Size(max = 1000)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdate;
    @Size(max = 100)
    @Column(name = "createby")
    private String createby;
    @Column(name = "updatedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedate;
    @Size(max = 100)
    @Column(name = "updateby")
    private String updateby;
    @Size(max = 1000)
    @Column(name = "dynamicparams")
    private String dynamicparams;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guidtopic")
    private Collection<Coursetopic> coursetopicCollection;

    public Topic() {
    }

    public Topic(Integer guid) {
        this.guid = guid;
    }

    public Topic(Integer guid, String userguid, String name, String description, boolean status, Date createdate) {
        this.guid = guid;
        this.userguid = userguid;
        this.name = name;
        this.description = description;
        this.status = status;
        this.createdate = createdate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    @XmlTransient
    @JsonIgnore
    public Collection<Coursetopic> getCoursetopicCollection() {
        return coursetopicCollection;
    }

    public void setCoursetopicCollection(Collection<Coursetopic> coursetopicCollection) {
        this.coursetopicCollection = coursetopicCollection;
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
        if (!(object instanceof Topic)) {
            return false;
        }
        Topic other = (Topic) object;
        if ((this.guid == null && other.guid != null) || (this.guid != null && !this.guid.equals(other.guid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itehl.service.model.entity.Topic[ guid=" + guid + " ]";
    }
    
}
