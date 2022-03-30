package com.company;

import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        for (int i=number1; i<=number2; i++){
            System.out.println(i+"*"+i+"="+(i*i));
        }
    }
}