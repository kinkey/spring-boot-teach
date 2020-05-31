package com.learning.springboot.sda.controller;


import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.service.HelloWorldHelpService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProjectController.class)
public class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    HelloWorldHelpService hwhs;

    @Test
    public void shouldReturnOK() throws Exception {

        Mockito.when(hwhs.isItAGoodDay()).thenReturn(true);

        mockMvc.perform(get("/myHelloWorld"))
                .andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString(
                                "Hello World! It's a fine day!")));
    }
}
