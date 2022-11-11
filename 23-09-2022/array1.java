import java.util.Scanner;
/*
вводим  длину массива и заполняем массив элементами с консоли а потом проверяем и выводим по какой-то логике
 */

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
           if (n%2==0){
               for (int i = 0; i < arr.length; i++) {
                   System.out.println(arr[i]);
               }
           }else {
               for (int i = arr.length-1; i >=0; i--) {
                   System.out.println(arr[i]);
               }

    }
 }
}
