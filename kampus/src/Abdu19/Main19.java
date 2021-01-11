package Abdu19;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double d = sc.nextDouble();
        System.out.println( "Введите третию переменную");
        double c = sc.nextDouble();
        if (a >= 0 && d >= 0 && c >= 0)
        System.out.println("Количество положительных чисел равно 3");
        else if (a >= 0 && d >= 0 || d >= 0 && c >= 0 || a >= 0 && c >=0)
        System.out.println("количество полдожительных чиселровно 2");
        else if (a >= 0 || d >= 0 || c >= 0)
        System.out.println("количество положительных чиселповно 1 ");
    }
}
