import java.util.Scanner;

public class Drob3 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int nod = eulidAlgorithm(num1,num2);
        nod = Math.abs(nod);
        System.out.println(num1 / nod+" "+num2 / nod);
    }
    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return m;

    }
}