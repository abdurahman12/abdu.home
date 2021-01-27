package abdu21;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a= sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b= sc.nextDouble();
        if (b>a)
            System.out.println("Бодьшее число - " +b);
        if (a>b)
            System.out.println( "Большее число - " +a);
    }
}
