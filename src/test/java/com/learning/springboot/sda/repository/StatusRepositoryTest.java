package com.learning.springboot.sda.repository;

import com.learning.springboot.sda.entity.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.validation.ConstraintViolationException;


@ExtendWith(SpringExtension.class)
@DataJpaTest
public class StatusRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    StatusRepository statusRepository;

    @Test
    public void setStatusTest(){


        String expectedStatusName = "statusNameForTest";

        Status testStatus = new Status(expectedStatusName);
        entityManager.persist(testStatus);
        entityManager.flush();

        Status byStatusName = statusRepository.findByStatusName(expectedStatusName);

        System.out.println("Found status " + byStatusName.toString());

        Assertions.assertEquals(byStatusName.getStatusName(), expectedStatusName);
    }

    @Test
    public void setStatusExceedStatusName(){
        String expectedStatusName = "veryLongStatusNameThatShouldNotBePersistedAtAllBecauseItsVeryLong";

        try{
            Status testStatus = new Status(expectedStatusName);
            entityManager.persist(testStatus);
            entityManager.flush();

        } catch (ConstraintViolationException cve){
            Assertions.assertTrue(cve.getMessage().contains("size must be between 0 and 30"));
        }


    }
}
