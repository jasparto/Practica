/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itehl.service.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bryan.silva
 */
@Entity
@Table(name = "coursetopic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coursetopic.findAll", query = "SELECT c FROM Coursetopic c"),
    @NamedQuery(name = "Coursetopic.findByGuid", query = "SELECT c FROM Coursetopic c WHERE c.guid = :guid"),
    @NamedQuery(name = "Coursetopic.findByGuidcourse", query = "SELECT c FROM Coursetopic c WHERE c.guidcourse = :guidcourse")})
public class Coursetopic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "guid")
    private Integer guid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "guidcourse")
    private int guidcourse;
    @JoinColumn(name = "guidtopic", referencedColumnName = "guid")
    @ManyToOne(optional = false)
    private Topic guidtopic;

    public Coursetopic() {
    }

    public Coursetopic(Integer guid) {
        this.guid = guid;
    }

    public Coursetopic(Integer guid, int guidcourse) {
        this.guid = guid;
        this.guidcourse = guidcourse;
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public int getGuidcourse() {
        return guidcourse;
    }

    public void setGuidcourse(int guidcourse) {
        this.guidcourse = guidcourse;
    }

    public Topic getGuidtopic() {
        return guidtopic;
    }

    public void setGuidtopic(Topic guidtopic) {
        this.guidtopic = guidtopic;
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
        if (!(object instanceof Coursetopic)) {
            return false;
        }
        Coursetopic other = (Coursetopic) object;
        if ((this.guid == null && other.guid != null) || (this.guid != null && !this.guid.equals(other.guid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itehl.service.model.entity.Coursetopic[ guid=" + guid + " ]";
    }
    
}
