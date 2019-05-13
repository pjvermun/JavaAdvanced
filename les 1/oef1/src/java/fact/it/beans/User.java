/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Pieter-Jan
 */
@Named
@RequestScoped
public class User {
    String name;
    String password;
    String confirmedPassword;
    
    /**
     * Creates a new instance of User
     */
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }
    
    public String validate() {
        System.out.println(password + confirmedPassword);
        if (password.equals(confirmedPassword)){
            return "succes";
        }
        else {
            return "error";
        }
    }
    
    
}
