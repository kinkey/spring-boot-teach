package com.learning.springboot.sda.controller;

public class OutsideSystem {

    public Integer getFirstNumber(){
        System.out.println("Connecting to the internet. Please wait");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 5;
    }

    public Integer getSecondNumber(){
        System.out.println("Connecting to the internet. Please wait");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 10;
    }

    public Integer getFirstNumberByParam(int param){
        return param;
    }

    public Integer getSecondNumberByParam(int param){
        return param;
    }
}
