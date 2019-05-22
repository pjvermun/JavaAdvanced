/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.controller;

import fact.it.www.dao.TeamFacade;
import fact.it.www.entity.Team;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.Query;

/**
 *
 * @author Els
 */
@Named(value = "teamController")
@SessionScoped
public class TeamController implements Serializable {

    @EJB
    private TeamFacade teamFacade;
    private Team team;

    /**
     * Creates a new instance of PHPTeamController
     */
    public TeamController() {
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Team> findAll() {

        return this.teamFacade.findAll();
    }

    public String add1() {
        team = new Team();
        return "addTeam";
    }

    public String add2() {
        this.teamFacade.create(team);
        return "index";
    }

}
