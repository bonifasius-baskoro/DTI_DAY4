package org.example.day4;

public class Task2 {
    public static void printStar(int n){
        for (int i = 1;  i <= n ; i++){
            System.out.println("\n");
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
        }
    }
}
