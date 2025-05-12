/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Chore;

/**
 *
 * @author user
 */
@Local
public interface ChoreFacadeLocal {

    void create(Chore chore);

    void edit(Chore chore);

    void remove(Chore chore);

    Chore find(Object id);

    List<Chore> findAll();

    List<Chore> findRange(int[] range);

    int count();
    
}
