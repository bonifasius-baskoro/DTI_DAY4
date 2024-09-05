package org.example.day4;

import java.util.Scanner;

public class Task5 {
    public static void changeCase(){
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Input the string:");
        String userString = userInput1.nextLine();
        StringBuilder stringInput =  new StringBuilder(userString);

        System.out.println(Character.isUpperCase(stringInput.charAt(1)));
        stringInput.setCharAt(2,'a');
        }
}

