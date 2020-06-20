package com.learning.springboot.sda.repository;


import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Integer> {



}
