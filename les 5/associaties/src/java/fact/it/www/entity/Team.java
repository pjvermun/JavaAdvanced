  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Werk
 */
@Entity
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String opdracht;
    private String nummer;
    @OneToMany(mappedBy = "team", fetch=FetchType.EAGER)
    private List<Persoon> leden = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getOpdracht() {
        return opdracht;
    }

    public void setOpdracht(String opdracht) {
        this.opdracht = opdracht;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
    
    public List<Persoon> getLeden() {
        return leden;
    }

    public void setLeden(List<Persoon> leden) {
        this.leden = leden;
    }

    public Team() {
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
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return opdracht + " (" + nummer + ")";
    }

}
