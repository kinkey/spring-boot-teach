package com.learning.springboot.sda.controller;


import com.learning.springboot.sda.DTO.PizzaOrderRequestDTO;
import com.learning.springboot.sda.DTO.ProjectDTO;
import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.entity.TodoItem;
import com.learning.springboot.sda.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class TodoController {


    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todo/{todoId}") // din path variable in path parameter
    public ResponseEntity<TodoItem> gethelloWorld(@PathVariable Integer todoId){

        Optional<TodoItem> item= todoRepository.findById(todoId);
        if(item.isPresent()){
            return new ResponseEntity<TodoItem>(item.get(), HttpStatus.OK);
        }
        return new ResponseEntity<TodoItem>(new TodoItem(), HttpStatus.NOT_FOUND);
    }
    @GetMapping("/todos") // din path variable in path parameter
    public ResponseEntity<List<TodoItem>> gethelloWorld(){

        List<TodoItem> all = todoRepository.findAll();

        return new ResponseEntity<List<TodoItem>>(all, HttpStatus.OK);
    }

    @DeleteMapping("/todo/{todoId}") // din path variable in path parameter
    public ResponseEntity<List<TodoItem>> delete(@PathVariable Integer todoId){

        todoRepository.deleteById(todoId);

        List<TodoItem> all = todoRepository.findAll();

        return new ResponseEntity<List<TodoItem>>(all, HttpStatus.OK);
    }

    @PostMapping(value = "/todos", consumes = "application/json", produces = "application/json") // din path variable in path parameter
    public ResponseEntity<List<TodoItem>> saveTodoItem(@RequestBody TodoItem todoItem){
        todoRepository.save(todoItem);

        List<TodoItem> all = todoRepository.findAll();
        MultiValueMap mv = new LinkedMultiValueMap<>();
        mv.add("SPECIAL HEADER", "SPECIAL VALUE");

        return new ResponseEntity<List<TodoItem>>(all, mv, HttpStatus.OK);
    }
}
