/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pieter-Jan
 */
@Entity
public class Opleiding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long nummer;
    private String opl_code;
    private String opl_titel;
    private String opl_thema;
    private int opl_duur;
    private int opl_max;

    public Opleiding() {
    }

    public Long getNummer() {
        return nummer;
    }

    public void setNummer(Long nummer) {
        this.nummer = nummer;
    }

    public String getOpl_code() {
        return opl_code;
    }

    public void setOpl_code(String opl_code) {
        this.opl_code = opl_code;
    }

    public String getOpl_titel() {
        return opl_titel;
    }

    public void setOpl_titel(String opl_titel) {
        this.opl_titel = opl_titel;
    }

    public String getOpl_thema() {
        return opl_thema;
    }

    public void setOpl_thema(String opl_thema) {
        this.opl_thema = opl_thema;
    }

    public int getOpl_duur() {
        return opl_duur;
    }

    public void setOpl_duur(int opl_duur) {
        this.opl_duur = opl_duur;
    }

    public int getOpl_max() {
        return opl_max;
    }

    public void setOpl_max(int opl_max) {
        this.opl_max = opl_max;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opleiding)) {
            return false;
        }
        Opleiding other = (Opleiding) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fact.it.www.entity.Opleiding[ id=" + id + " ]";
    }
    
}
