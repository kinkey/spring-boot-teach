package com.learning.springboot.sda.controller;

import com.learning.springboot.sda.service.SalaryProvider;

public class SalaryCalculator {

    SalaryProvider salaryProvider;

    public String amIHappy(){
        int salary = salaryProvider.getSalary();

        if(salary == 100){
            return "I am Happy";
        }
        return "I am a sad puppy";
    }

    public int salaryAfterBuyingShoes(){
        int shoePrice = 30;

        int salary = salaryProvider.getSalary();

        int remainingMoney = salary - shoePrice;

        // if salary == 100 => RM => 70
        // if salary == 50 => RM => 20;
        // if salary == 0 => RM??? => Refactor to not buy shoes. and just return 0;

        return remainingMoney;
    }
}
