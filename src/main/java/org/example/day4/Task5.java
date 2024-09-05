package org.example.day4;

import java.util.Scanner;

public class Task5 {
    public static void changeCase(){
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Input the string:");
        String userString = userInput1.nextLine();
        StringBuilder stringInput =  new StringBuilder(userString);

        for (int i = 0; i <stringInput.length(); i++){
            if(Character.isUpperCase(stringInput.charAt(i))){
                stringInput.setCharAt(i,Character.toLowerCase(stringInput.charAt(i)));
            }
            else{
                stringInput.setCharAt(i,Character.toUpperCase(stringInput.charAt(i)));
            }
        }
        System.out.println(stringInput.toString());
        }
}

