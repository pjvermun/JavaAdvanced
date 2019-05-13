/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Pieter-Jan
 */
@Named(value = "reiziger")
@RequestScoped
public class Reiziger {
    String naam;
    String tempGeboorteDatum;
    Date geboorteDatum;
    
    /**
     * Creates a new instance of Reiziger
     */
    public Reiziger() {
    }

    public String getTempGeboorteDatum() {
        return tempGeboorteDatum;
    }

    public void setTempGeboorteDatum(String tempGeboorteDatum) {
        this.tempGeboorteDatum = tempGeboorteDatum;
        SimpleDateFormat datumFormat = new SimpleDateFormat("dd/MM/yyyy");
       
        try {
            this.geboorteDatum = datumFormat.parse(tempGeboorteDatum);
        } catch (Exception e) {
        }
    }
    
    

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = (geboorteDatum);
    }
    
    
}
