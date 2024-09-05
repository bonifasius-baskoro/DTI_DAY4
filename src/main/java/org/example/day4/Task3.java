package org.example.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void insertArray(){
        Scanner taskInput = new Scanner(System.in);

        boolean isContinue = true;
        ArrayList<Integer> arrayNumber = new ArrayList<Integer>();

        do{
            System.out.println("Insert number to array :");
            String userInput = taskInput.nextLine();
            arrayNumber.add(Integer.parseInt(userInput));
            System.out.println("Press y to continue or press n to stop:");
            String userInput2 = taskInput.nextLine();
            if(userInput2.equalsIgnoreCase("n")){
                isContinue = false;
                System.out.println(arrayNumber.toString());
            }


        }while(isContinue);
    }


}
