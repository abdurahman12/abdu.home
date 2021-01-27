package abdu22;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a= sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b= sc.nextDouble();
        if (a>b) {
            System.out.println("порядковый номер меньшего числа -4");
        }
    }
}
