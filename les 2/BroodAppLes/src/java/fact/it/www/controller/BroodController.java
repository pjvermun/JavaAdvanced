/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.BroodFacade;
import fact.it.www.entity.Brood;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Pieter-Jan
 */
@Named(value = "broodController")
@SessionScoped
public class BroodController implements Serializable {

    @EJB
    private BroodFacade broodFacade;
    
    private Brood brood = new Brood();

    /**
     * Creates a new instance of BroodController
     */
    public BroodController() {
        
    }

    public Brood getBrood() {
        return brood;
    }

    public void setBrood(Brood brood) {
        this.brood = brood;
    }
    
    public List<Brood> findAll() {
        return this.broodFacade.findAll();
    }
    
    public String add1() {
        this.brood = new Brood();
        return "add";
    }
    
    public String add2() {
        this.broodFacade.create(this.brood);
        return "index";
    }
    
    public String edit1(Brood b) {
        this.brood = b;
        return "edit";
    }
    
    public String edit2() {
        this.broodFacade.edit(this.brood);
        return "index";
    } 
    
    public void delete(Brood b) {
        this.broodFacade.remove(b);
    }
    
}
