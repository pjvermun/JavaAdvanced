/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dao;

import fact.it.www.entity.Brood;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
    public List<Brood> getBrodenOpPrijs() {
        return em.createNamedQuery("Brood.sorteerOpPrijs").getResultList();
    }
    
    public List<Brood> zoekBroden(String zoekwaarde) {
        Query q = em.createNamedQuery("Brood.beginLetters");
        q.setParameter("letter", "%" + zoekwaarde + "%");
        return q.getResultList();
    }
    
    public long getAantalBroden() {
        return (Long) em.createNamedQuery("Brood.aantalBroden").getSingleResult();
    }
     
}
