package com.learning.springboot.sda.service;

public class SalaryProvider {

    public boolean getEndOfMonth(){
        return false;
    }

    public boolean getMidMonth(){
        return true;
    }

    // if end month => no more money => return 0
    // if mid month => some money => return 50
    // if start month => (endMOnth = false && midMonth = false) => return 100;
    public int getSalary(){
        if(getEndOfMonth() == true){
            return 0;
        }
        if(getMidMonth() == true){
            return 50;
        }
        return 100;
    }
}
