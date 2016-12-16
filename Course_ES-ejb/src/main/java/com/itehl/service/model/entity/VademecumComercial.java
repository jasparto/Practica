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
 * @author juliano
 */
@Entity
@Table(name = "vademecum_comercial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VademecumComercial.findAll", query = "SELECT v FROM VademecumComercial v")
    , @NamedQuery(name = "VademecumComercial.findByCodComercial", query = "SELECT v FROM VademecumComercial v WHERE v.codComercial = :codComercial")
    , @NamedQuery(name = "VademecumComercial.findByNombre", query = "SELECT v FROM VademecumComercial v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "VademecumComercial.findByCodCum", query = "SELECT v FROM VademecumComercial v WHERE v.codCum = :codCum")
    , @NamedQuery(name = "VademecumComercial.findByFechaElaboracion", query = "SELECT v FROM VademecumComercial v WHERE v.fechaElaboracion = :fechaElaboracion")
    , @NamedQuery(name = "VademecumComercial.findByFechaVencimiento", query = "SELECT v FROM VademecumComercial v WHERE v.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "VademecumComercial.findByFechaRegistro", query = "SELECT v FROM VademecumComercial v WHERE v.fechaRegistro = :fechaRegistro")})
public class VademecumComercial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cod_comercial")
    private String codComercial;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "cod_cum")
    private String codCum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_elaboracion")
    @Temporal(TemporalType.DATE)
    private Date fechaElaboracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    public VademecumComercial() {
    }

    public VademecumComercial(String codComercial) {
        this.codComercial = codComercial;
    }

    public VademecumComercial(String codComercial, Date fechaElaboracion, Date fechaVencimiento) {
        this.codComercial = codComercial;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodComercial() {
        return codComercial;
    }

    public void setCodComercial(String codComercial) {
        this.codComercial = codComercial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodCum() {
        return codCum;
    }

    public void setCodCum(String codCum) {
        this.codCum = codCum;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codComercial != null ? codComercial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VademecumComercial)) {
            return false;
        }
        VademecumComercial other = (VademecumComercial) object;
        if ((this.codComercial == null && other.codComercial != null) || (this.codComercial != null && !this.codComercial.equals(other.codComercial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itehl.service.model.entity.VademecumComercial[ codComercial=" + codComercial + " ]";
    }
    
}
