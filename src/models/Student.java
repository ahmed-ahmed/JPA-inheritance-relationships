/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author sa
 */
@Entity
public class Student extends Person{
    float gpa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentId")
    private List<Notebook> noteBooks = new ArrayList();
    
    public Student(String name, float gpa) {
        super(name);
        this.gpa = gpa;
    }
    
    public void addNoteBook(Notebook item){
        this.noteBooks.add(item);
    }

    public Student() {
    }
    
    
}
