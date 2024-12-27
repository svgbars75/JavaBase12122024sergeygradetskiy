package HW4TotalSales.HW5IncomTax;

import java.util.Scanner;

public class IncomTax {

    static double  n1;
    static double n2;
    static double n3;
    static double n ;

    public static void main(String[] args) {

        Scanner tax = new Scanner(System.in);
        System.out.println("Введіть суму дохода (ЗП) : ");
        n = tax.nextDouble();
        if (n <= 10000) {
            n1 = (n*2.5)/100;
            System.out.println("Сума податку від дохода, від 0 грн до 10000 грн включно = " + n1);

        }
        else if ((10000<n)&&(n<=25000)){ ;
                n2 = (n* 4.3) / 100;
                System.out.println("Cума податку від 10000 грн до 25000 грн включно = " + n2);
            }
              else {
                    n3 = (n * 6.7) / 100;
                    System.out.println("Сума податку від 25000 грн = " + n3);
            
        }


    }
}
