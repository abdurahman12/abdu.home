package abdu25;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        System.out.println("Введите 4 целых числа");
        Scanner abdu = new Scanner(System.in);
        int d = abdu.nextInt();
        Scanner abdu2 = new Scanner(System.in);
        int k = abdu2.nextInt();
        if (d!=k) {
            d = d + k;
            k = d;
            System.out.println("сумма чисел = " + d);
        }
        if (d==k){
            d=0;
            k=0;
            System.out.println("новые знание раваны " +k + ""+d);


        }
    }
}
