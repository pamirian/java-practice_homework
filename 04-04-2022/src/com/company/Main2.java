/*
Задача №3065. Сумма последовательности
 */
package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber, summ = 0;
        while (scanner.hasNextInt()){
            enteredNumber=scanner.nextInt();
            if (enteredNumber==0){
                break;
            }
            summ = summ + enteredNumber;
        }
        System.out.println(summ);
    }
}
