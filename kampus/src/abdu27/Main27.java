package abdu27;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменую");
        double b = sc.nextDouble();
        System.out.println("Введите третью переменную");
        double h = sc.nextDouble();
        if (b > a)
            System.out.println("меньшее число =4 " + a);
        if (a > b)
            System.out.println("меньшее число =7" + 7);
        if (a > h)
            System.out.println("наименьшее число =2" + h);

    }

}
