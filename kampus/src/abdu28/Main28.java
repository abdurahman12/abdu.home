package abdu28;

import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b = sc.nextDouble();
        System.out.println("Введите третию переменную");
        double h = sc.nextDouble();
        if (a>h)
            if (a>b)
                System.out.println("наибольшее число"+a);
            if (h<b)
                if (h<b)
                    System.out.println("наименьшее число"+h);
                if (b==a)
                    if (b==h)
                        System.out.println("среднее число"+h);

    }
}
