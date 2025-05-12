/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Reminder;

/**
 *
 * @author user
 */
@Local
public interface ReminderFacadeLocal {

    void create(Reminder reminder);

    void edit(Reminder reminder);

    void remove(Reminder reminder);

    Reminder find(Object id);

    List<Reminder> findAll();

    List<Reminder> findRange(int[] range);

    int count();
    
}
