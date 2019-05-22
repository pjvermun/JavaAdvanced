/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dao;

import fact.it.www.entity.Persoon;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pieter-Jan
 */
@Stateless
public class PersoonFacade extends AbstractFacade<Persoon> {

    @PersistenceContext(unitName = "singleTablePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersoonFacade() {
        super(Persoon.class);
    }
    
}
