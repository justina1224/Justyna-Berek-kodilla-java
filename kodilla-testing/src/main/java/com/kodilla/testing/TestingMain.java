package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator myCalculator = new Calculator();

        int addingResult = myCalculator.add(3, 7);

        if(addingResult==10){
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding test failed!");
        }

        int subtractingResult = myCalculator.subtract(5, 2);

        if(subtractingResult==3){
            System.out.println("Subtracting test OK");
        } else {
            System.out.println("Subtracting test failed!");
        }

    }
}
