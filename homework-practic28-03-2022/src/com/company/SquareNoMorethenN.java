package com.company;
import java.util.Scanner;
public class SquareNoMorethenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        int s = 1;
        for (int i=1; i<=number1; i++){
            s = i * i;
            if (s<=number1) {
                System.out.println(s);
            }

        }
    }
}
