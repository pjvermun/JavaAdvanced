/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Werk
 */
@Entity
public class Persoon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String naam;
    @ManyToOne
    private Team team;
    @OneToOne(cascade={CascadeType.PERSIST}) 
    private Paspoort paspoort;
    @OneToMany
    private List<Telefoon> telefoonnrs = new ArrayList<>();
    @ManyToMany
    @JoinTable(name="wievolgtwat") 
    private List<Vak> vakken = new ArrayList<>();

    public Persoon() {
        paspoort = new Paspoort();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Telefoon> getTelefoonnrs() {
        return telefoonnrs;
    }
    
    public void addTelefoonnr(String type, String nummer){
        Telefoon telefoonnr = new Telefoon();
        telefoonnr.setType(type);
        telefoonnr.setNummer(nummer);
        this.telefoonnrs.add(telefoonnr);
    }

    public void setTelefoonnrs(List<Telefoon> telefoonnrs) {
        this.telefoonnrs = telefoonnrs;
    }

    public List<Vak> getVakken() {
        return vakken;
    }

    public void setVakken(ArrayList<Vak> vakken) {
        this.vakken = vakken;
    }


    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paspoort getPaspoort() {
        return paspoort;
    }

    public void setPaspoort(Paspoort paspoort) {
        this.paspoort = paspoort;
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
        if (!(object instanceof Persoon)) {
            return false;
        }
        Persoon other = (Persoon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dit is niet nodig";
    }

}
