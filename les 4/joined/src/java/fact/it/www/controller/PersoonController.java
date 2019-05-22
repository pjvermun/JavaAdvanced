/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.PersoonFacade;
import fact.it.www.entity.Kaderlid;
import fact.it.www.entity.Klant;
import fact.it.www.entity.Persoon;
import fact.it.www.entity.Werknemer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Els
 */
@Named(value = "persoonController")
@SessionScoped
public class PersoonController implements Serializable {

    @EJB
    private PersoonFacade persoonFacade;
    private Persoon persoon;

    public PersoonController() {
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    public String addPersoon1() {
        this.persoon = new Persoon();
        return "addPersoon";
    }

    public String addKlant1() {
        this.persoon = new Klant();
        return "addKlant";
    }

    public String addKaderlid1() {
        this.persoon = new Kaderlid();
        return "addKaderlid";
    }

    public String addWerknemer1() {
        this.persoon = new Werknemer();
        return "addWerknemer";
    }

    public String add2() {
        this.persoonFacade.create(persoon);
        return "index";
    }
}
