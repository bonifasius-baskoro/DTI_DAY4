package org.example.day4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void guessNumber(){
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to guess number game");
        int random1 = rand.nextInt(100);
        System.out.println(random1);
        boolean isTrue = false;
        int guess = 0;
        do {
            System.out.println("Input your guess : ");
            int userGuess =Integer.parseInt(userInput.nextLine());
            if( userGuess< random1){
                System.out.println("Too low!");
                guess++;
            }
            else if(userGuess > random1){
                System.out.println("Too high!");
                guess++;
            }
            else{
                System.out.println("You are right in "+  guess + " guesses");
                isTrue = true;
                break;
            }
            System.out.println("Do you want to give up (y/n)?");
            String userGuess2 = userInput.nextLine();
            if(userGuess2.equalsIgnoreCase("y")){
                System.out.println("You don't have any spirit, this is the answer :" + random1 ) ;
                break;
            }

        }while (!isTrue);
    }
}
