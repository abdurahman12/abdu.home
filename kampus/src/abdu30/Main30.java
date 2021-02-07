package abdu30;

import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Введите первую переменную ");
        double i = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double s = sc.nextDouble();
        System.out.println("Введите третью переменную");
        double y = sc.nextDouble();
        if (i>s)  if (i>y)   if (s>i)  if (s>y)
            System.out.println("первое наибольшее"+ i);
        System.out.println("второе наибольшее" +s) ;

    }
}
