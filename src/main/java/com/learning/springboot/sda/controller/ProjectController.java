package com.learning.springboot.sda.controller;


import com.learning.springboot.sda.DTO.PizzaDTO;
import com.learning.springboot.sda.DTO.ProjectDTO;
import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.service.HelloWorldHelpService;
import com.learning.springboot.sda.service.ProjectEntityConverter;
import com.learning.springboot.sda.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    HelloWorldHelpService helloWorldHelpService;

    @GetMapping(value = "/myHelloWorld", produces = "application/text")
    public ResponseEntity<String> getValue(){
        if(helloWorldHelpService.isItAGoodDay()){
            return new ResponseEntity<String>("Hello World! It's a fine day!",
                    HttpStatus.OK);
        }

        return new ResponseEntity<String>(
                "It's raining outside. It's not a good day for science",
                HttpStatus.NOT_FOUND);
    }
}
