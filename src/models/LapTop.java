package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LapTop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String model;

    public LapTop(String model) {
        this.model = model;
    }

    public LapTop() {
    }
    
    
    
}
