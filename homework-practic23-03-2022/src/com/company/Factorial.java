package com.company;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            if (number==0){
                System.out.println("1");
            }

                factorial = factorial * i;
            i++;
            }

        System.out.println(factorial);
        }

    }
