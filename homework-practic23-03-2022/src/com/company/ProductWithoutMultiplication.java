
package com.company;

import java.util.Scanner;


public class ProductWithoutMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=scanner.nextInt();
        int number2=scanner.nextInt();

        int counter=0;
        int summ=0;

        while (counter<number2){
            summ=summ+number1;
            counter++;
        }
        System.out.println(summ);}
}