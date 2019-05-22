/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.PersoonFacade;
import fact.it.www.entity.Persoon;
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

    public List<Persoon> findAll() {
        return this.persoonFacade.findAll();
    }

    public String add1() {
        persoon = new Persoon();
        return "addTeamlid";
    }

    public String add2() {
        this.persoonFacade.create(persoon);
        return "index";
    }

    public String edit() {
        this.persoonFacade.edit(persoon);
        this.persoon = new Persoon();
        return "index";
    }

    public String addTelefoonnummer(String type, String nummer) {
        persoon.addTelefoonnr(type, nummer);
        return edit();
    }
}
