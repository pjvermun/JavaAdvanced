/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.OpleidingFacade;
import fact.it.www.entity.Opleiding;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Pieter-Jan
 */
@Named(value = "opleidingController")
@SessionScoped
public class OpleidingController implements Serializable {

    @EJB
    private OpleidingFacade opleidingFacade;
    
    private Opleiding opleiding = new Opleiding();
    private List<Opleiding> opleidingen;
    /**
     * Creates a new instance of OpleidingController
     */
    public OpleidingController() {
    }

    public Opleiding getOpleiding() {
        return opleiding;
    }

    public List<Opleiding> getOpleidingen() {
        return opleidingen;
    }

    public void setOpleidingen(List<Opleiding> opleidingen) {
        this.opleidingen = opleidingen;
    }
    
    

    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }
    
    public List<Opleiding> findAll() {
        return this.opleidingFacade.findAll();
    }
    
    public String add1() {
        this.opleiding = new Opleiding();
        return "add";
    }
    
    public String add2() {
        this.opleidingFacade.create(this.opleiding);
        return "admin";
    }
    
    public String edit1(Opleiding o) {
        this.opleiding = o;
        return "edit";
    }
    
    public String edit2() {
        this.opleidingFacade.edit(this.opleiding);
        return "admin";
    }
    
    public void delete(Opleiding o) {
        this.opleidingFacade.remove(o);
    }
    
    public List<Opleiding> getOpleidingenOpThema() {
        return this.opleidingFacade.getOpleidingenOpThema();
    }
    
    public String details(Opleiding o) {
        this.opleiding = o;
        return "details";
    }
    
    public List<String> getThemas() {
        return this.opleidingFacade.getThemas();
    }
    
    public String zoekThema(String t) {
        opleidingen = this.opleidingFacade.zoekThema(t);
        return "overzicht";
    }
    
    public String overzichtThema() {
        opleidingen = this.getOpleidingenOpThema();
        return "overzicht";
    }
    
    public String zoekTitel(String t) {
        opleidingen = this.opleidingFacade.zoekTitel(t);
        return "overzicht";
    }
    
}
