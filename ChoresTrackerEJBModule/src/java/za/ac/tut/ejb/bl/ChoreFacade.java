/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Chore;

/**
 *
 * @author user
 */
@Stateless
public class ChoreFacade extends AbstractFacade<Chore> implements ChoreFacadeLocal {

    @PersistenceContext(unitName = "ChoresTrackerEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ChoreFacade() {
        super(Chore.class);
    }
    
}
