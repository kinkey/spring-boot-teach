package com.learning.springboot.sda.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    OutsideSystem outsideSystemMock = Mockito.mock(OutsideSystem.class);

    @Test
    public void addNumbersTest(){
        Calculator c = new Calculator();

        int expectedResult = 3;

        int actualResult = c.add(1, 2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addNumbersFromOutsideSystem(){
        Mockito.when(outsideSystemMock.getFirstNumber()).thenReturn(100);
        Mockito.when(outsideSystemMock.getSecondNumber()).thenReturn(899);

        Calculator c = new Calculator(outsideSystemMock);

        int expectedResult = 999;

        int actualResult = c.addRecievedNumbersFromOutsideSystem();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doubleSecondNumber(){
        Mockito.when(outsideSystemMock.getSecondNumber()).thenReturn(10);

        Calculator c = new Calculator(outsideSystemMock);

        int expectedResult = 20;

        int actualResult = c.doubleSecondRecievedNumberFromOutside();

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void powerOfTwo(){
        Mockito.when(outsideSystemMock.getFirstNumber()).thenReturn(5);

        Calculator c = new Calculator(outsideSystemMock);

        int expectedResult = 25;

        double actualResult = c.raiseToPowerOfTwoFirstNumberFromOutside(2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void powerOfTwoMultipleCalls(){
        Mockito.when(outsideSystemMock.getFirstNumber()).thenReturn(5);
        //OutsideSystem outsideSystem = new OutsideSystem();
        Calculator c = new Calculator(outsideSystemMock);

        int expectedResult = 25;

        double actualResult = c.raiseToPowerOfTwoFirstNumberFromOutside(2);

        Assertions.assertEquals(expectedResult, actualResult);

        Mockito.verify(outsideSystemMock, Mockito.times(1)).getFirstNumber();
    }

}
