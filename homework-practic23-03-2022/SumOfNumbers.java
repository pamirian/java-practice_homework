package com.company;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= number){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}