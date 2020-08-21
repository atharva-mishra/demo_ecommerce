package com.ecommerce.demo.modals;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollid;
    private String name;
    /*Constructor*/

    public Role(String name) {
        this.name = name;
    }

    /* Getter and Setters*/

    public int getRollid() {
        return rollid;
    }

    public void setRollid(int rollid) {
        this.rollid = rollid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
