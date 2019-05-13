/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Els
 */
@Named
@RequestScoped
public class Student {

    private String naam;
    private String land;
    private String favorieteTaal;

    // no-arg constructor
    public Student() {
        System.out.println("er wordt een student-object gemaakt");
        naam = "geef je naam op";
    }

    // getter/setter methods	
    public String getNaam() {
        System.out.println("getNaam wordt opgeroepen");
        return naam;
    }

    public void setNaam(String naam) {
        System.out.println("setNaam met de waarde " + naam + " wordt opgeroepen");
        this.naam = naam;
    }


    public String getLand() {
        System.out.println("getLand wordt opgeroepen");
        return land;
    }

    public void setLand(String land) {
        System.out.println("setLand met de waarde " + land + " wordt opgeroepen");

        this.land = land;
    }

    public String getFavorieteTaal() {
        System.out.println("getFavorieteTaal wordt opgeroepen");
        return favorieteTaal;
    }

    public void setFavorieteTaal(String favorieteTaal) {
        System.out.println("setFavorieteTaal met de waarde " + favorieteTaal + " wordt opgeroepen");
        this.favorieteTaal = favorieteTaal;
    }
}
