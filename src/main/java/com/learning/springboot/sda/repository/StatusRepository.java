package com.learning.springboot.sda.repository;

import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

     Optional<Status> getByStatusName(String statusName);
}
