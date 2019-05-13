/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.dao;

import fact.it.www.entity.Opleiding;
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
public class OpleidingFacade extends AbstractFacade<Opleiding> {

    @PersistenceContext(unitName = "oef1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OpleidingFacade() {
        super(Opleiding.class);
    }
    
    public List<Opleiding> getOpleidingenOpThema() {
        return em.createNamedQuery("Opleiding.sorteerOpThema").getResultList();
    }
    
    public List<String> getThemas() {
        return em.createNamedQuery("Opleiding.getThemas").getResultList();
    }
    
    public List<Opleiding> zoekThema(String zoekwaarde) {
        Query q = em.createNamedQuery("Opleiding.zoekThema");
        q.setParameter("thema",zoekwaarde);
        return q.getResultList();
    }
    
    public List<Opleiding> zoekTitel(String zoekwaarde) {
        Query q = em.createNamedQuery("Opleiding.zoekTitel");
        q.setParameter("titel", "%" + zoekwaarde + "%");
        return q.getResultList();
    }
    
}
