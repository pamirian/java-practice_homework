/*
Задача №3064. Длина последовательности
 */
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber, summ = 0;
        while (scanner.hasNextInt()){
            if (scanner.nextInt()==0){
                break;
            }
            summ = summ + 1;
        }
        System.out.println(summ);
    }
}
