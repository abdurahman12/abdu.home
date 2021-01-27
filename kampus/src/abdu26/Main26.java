package abdu26;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную ");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b = sc.nextDouble() ;
        if (a>b || a<b)
            if (a>b)
                System.out.println("a>b"+a);
            if (a<b)
                System.out.println("a<b"+b);
            if (a==b)
                System.out.println("a==b"+0);
    }
}
