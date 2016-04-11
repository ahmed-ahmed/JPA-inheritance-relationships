/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personsapp_jpa;

import javax.persistence.*;
import models.*;

 
public class PersonsApp_JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Student s1 = new Student("jack", 3.4f);
        s1.addNoteBook(new Notebook(100));
        s1.addNoteBook(new Notebook(120));
        s1.addNoteBook(new Notebook(60));

        Student s2 = new Student("john", 3.2f);
        s2.addNoteBook(new Notebook(200));
        s2.addNoteBook(new Notebook(50));

        Student s3 = new Student("jill", 3.6f);
        s1.addNoteBook(new Notebook(300));
        
        Teacher t1 = new Teacher("jim", 45000);
        t1.setLapTop(new LapTop("dell"));
        
        Teacher t2 = new Teacher("jasmin", 46000);
        t2.setLapTop(new LapTop("mac"));
        
        
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personsApp_JPAPU");
        EntityManager em =  emf.createEntityManager();
        
        EntityTransaction tx =  em.getTransaction();
        tx.begin();
        
        em.persist(s1);        
        em.persist(s2);
        em.persist(s3);
        em.persist(t1);
        em.persist(t2);

        
        tx.commit();
        
        
        MyCRUD c = new MyCRUD();
        c.deleteStudent(3);
        
        em.close();
        emf.close();
}
    
}
