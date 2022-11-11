/*
Модифицировнный алгоритм евклида
 */

public class Nok {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        System.out.println("НОД("+ n1+", "+ n2+ ") = "+getNok(n1,n2));
        System.out.print("НОК("+ n1+", "+ n2+ ") = "+n1*n2/getNok(n1,n2));
 }

    public static int getNok(int n1, int n2){
        int nod = 1;
        if (n1 < n2){
            nod = n1;
        }
        else{
            nod = n2;
        }
        while ((n1 % nod != 0)|| (n2 % nod != 0)){
            nod = nod - 1;
        }
        return nod;
    }


}