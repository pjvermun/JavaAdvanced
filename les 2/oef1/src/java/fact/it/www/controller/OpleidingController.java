/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.OpleidingFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
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
    /**
     * Creates a new instance of OpleidingController
     */
    public OpleidingController() {
    }
    
}
