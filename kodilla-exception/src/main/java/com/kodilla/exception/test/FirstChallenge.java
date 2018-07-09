package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3,0);
        } catch (ArithmeticException e) {
            System.out.println("Catched - " + e + " dividing by zero!");
        }finally {
            System.out.println("All exceptions have been handled. Program is running well!");
        }
    }
}
