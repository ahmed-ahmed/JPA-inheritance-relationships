/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personsapp_jpa;

import java.io.Console;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import models.Student;
import sun.security.ssl.Debug;

public class MyCRUD {
    EntityManager em;

    public MyCRUD() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personsApp_JPAPU");
        em =  emf.createEntityManager();
    }
    
    public boolean deleteStudent (int studentId){
        Student s = em.find(Student.class, studentId);
        if(s != null){
            System.out.println(s.getName());
            EntityTransaction tx =  em.getTransaction();
            tx.begin();
            em.remove(s);
            tx.commit();
            em.close();
            return true;
        }
        return false;
    }

}
