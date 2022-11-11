/**
 * Евклид
 */
public class Nod {
    public static void main(String[] args) {
        int a = 100;
        int b = 75;
        System.out.print("НОД ("+a+", "+b+") = " );
        while (a != b){
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println( a );

        System.out.println("________________" );
/**
 * НОД перебором
 */

       a = 12;
       b = 8;
        int nod = 1;
        if (a < b){
            nod = a;
        }
        else{
            nod = b;
        }
        while ((a % nod != 0)|| (b % nod != 0)){
            nod = nod - 1;
        }
        System.out.println("НОД ("+a+" "+b+") = " + nod );

     /*
Модифицировнный алгоритм евклида
 */

                int n1 = 14;
                int n2 = 21;
                System.out.print("НОД ("+ n1+" "+ n2+ ") = ");

                int ostatok = n1 % n2 ;

                while (ostatok != 0) {
                    n1 = n2;
                    n2 = ostatok;
                    ostatok = n1 % n2;
                }
                System.out.println( n2 );


            }


        }

