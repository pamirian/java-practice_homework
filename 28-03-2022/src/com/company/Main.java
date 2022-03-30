package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int s = 0;
            for (int i=1; i <= number; i++){
                 s = s+2;
                 System.out.print(s+" ");
            }
    }
}
