/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Pieter-Jan
 */
@Named(value = "bus")
@SessionScoped
public class Bus implements java.io.Serializable{
    ArrayList<Reiziger> reizigers;
    
    /**
     * Creates a new instance of Bus
     */
    public Bus() {
        reizigers = new ArrayList<Reiziger>();
    }
    
    public String add(Reiziger reiziger) {
        if (reizigers.size() > 2){
            return "error";
        }
        try {
            reizigers.add(reiziger);
        } catch (Exception e) {
            return "error";
        }
        return "lijst";
    }

    public ArrayList<Reiziger> getReizigers() {
        return reizigers;
    }

    public void setReizigers(ArrayList<Reiziger> reizigers) {
        this.reizigers = reizigers;
    }
    
    
}
