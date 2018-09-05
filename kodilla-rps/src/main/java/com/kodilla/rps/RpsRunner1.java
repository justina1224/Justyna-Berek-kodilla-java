package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RpsRunner1 {
    static int numberOfRounds;

    public static void main(String[] args) {
        RockPaperScissors1 rps = new RockPaperScissors1();
        Scanner sc = new Scanner(System.in);

        rps.startTheGame();
        String name = sc.nextLine();
        System.out.println("How many rounds do you want to play?");
        boolean wrongInput = false;
        do {
            try {
                numberOfRounds = sc.nextInt();
                if (numberOfRounds < 0) {
                    throw new Exception("Wrong number");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please choose an integer with a range from 1 to 20");
                wrongInput = true;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Please choose an integer with a range from 1 to 20");
                wrongInput = true;
                sc.nextLine();
            }
        } while (wrongInput);
        System.out.println(name + ", please press one of the following:");
        rps.showInstruction();
        rps.play();
    }
}