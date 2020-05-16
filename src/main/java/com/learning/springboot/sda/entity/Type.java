package com.learning.springboot.sda.entity;

import javax.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId")
    Integer typeId;

    @Column(name = "name", nullable = false)
    String name;

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", name='" + name + '\'' +
                '}';
    }
}
