package com.learning.springboot.sda.entity;
import javax.persistence.*;
import java.util.List;


@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    Integer statusId;

    @Column(name = "statusName", nullable = false)
    String statusName;

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}
