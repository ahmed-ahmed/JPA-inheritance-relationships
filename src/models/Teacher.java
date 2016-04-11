/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Teacher extends Person{
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    private LapTop lapTop;
    
    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void setLapTop(LapTop lapTop) {
        this.lapTop = lapTop;
    }

    public LapTop getLapTop() {
        return lapTop;
    }

    public Teacher() {
    }
    
    
}
