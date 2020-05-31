package com.learning.springboot.sda.entity;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name="status")
public class Status {

    public Status() {
    }

    public Status(String statusName) {
        this.statusName = statusName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusId")
    Integer statusId;

    @Column(name = "statusName", nullable = false)
    @Size(max=30)
    String statusName;

    @OneToMany(mappedBy = "status")
    List<Project> statuses;


    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", statusName='" + statusName + '\'' +
                '}';
    }
}
