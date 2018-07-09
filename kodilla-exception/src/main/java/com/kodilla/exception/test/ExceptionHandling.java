package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]) {
        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(2.5, 2.5);
        } catch (Exception e) {
            System.out.println(("Problem while processing the method due to wrong value of arguments. " +
                    "Exception: \"" + e.toString() + "\" has been detected."));
        } finally {
            System.out.println("Exception handled");
        }
    }

}
