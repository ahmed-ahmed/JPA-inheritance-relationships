/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notebook {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int pages;

    public Notebook(int pages) {
        this.pages = pages;
    }

    public Notebook() {
    }
    
    
    
}
