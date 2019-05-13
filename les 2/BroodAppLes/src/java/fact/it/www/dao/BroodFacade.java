/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dao;

import fact.it.www.entity.Brood;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pieter-Jan
 */
@Stateless
public class BroodFacade extends AbstractFacade<Brood> {

    @PersistenceContext(unitName = "BroodAppLesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BroodFacade() {
        super(Brood.class);
    }
    
}
