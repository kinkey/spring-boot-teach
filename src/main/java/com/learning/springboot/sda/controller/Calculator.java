package com.learning.springboot.sda.controller;

public class Calculator {

    OutsideSystem outsideSystem;

    public Calculator(OutsideSystem outsideSystem) {
        this.outsideSystem = outsideSystem;
    }

    public Calculator() {
    }

    public int add (int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public int addRecievedNumbersFromOutsideSystem(){
        int firstNumber = outsideSystem.getFirstNumber();
        int secondNumber = outsideSystem.getSecondNumber();

        return firstNumber + secondNumber;
    }

    public int doubleSecondRecievedNumberFromOutside(){
        int secondNumber = outsideSystem.getSecondNumber();

        return secondNumber * 2;
    }

    public double raiseToPowerOfTwoFirstNumberFromOutside(int powerToRaise){
        int number = getFirstNumberInAVerySpecialWay();

        return Math.pow(number, powerToRaise);
    }

    private int getFirstNumberInAVerySpecialWay(){
        int firstNumber = outsideSystem.getFirstNumber();

        return firstNumber;
    }


}
