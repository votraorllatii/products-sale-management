/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class EntityManagerClasses {
     EntityManager em;

    public EntityManagerClasses() {
        this.em = Persistence.createEntityManagerFactory("LABKURSPU").createEntityManager();
    }
}
