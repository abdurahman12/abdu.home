package abdu20;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первую переменную: ");
        int num1 = task.nextInt();
        System.out.println("Введите вторую переменную:");
        int num2 = task.nextInt();
        System.out.println("Введите третью переменную:");
        int num3 = task.nextInt();
        if(num1>= 0 && num2 >= 0 && num3 >=0)
        System.out.println("количество положительных переменных ровно 3 ");
        else if (num1 >= 0 && num2 >= 0 || num2 >= 0 && num3 >= 0 || num1 >= 0 && num3 >= 0)
        System.out.println("количество положительных переменных ровно 2");
        else if (num1 >= 0 || num2  >= 0 || num3 >= 0)
        System.out.printf("количество положительных переменных ровно 1");
        if (num1 <= 0 && num2 <= 0 && num3 <=0)
        System.out.println("количество отрицательных переменных ровно 3");
        else if (num1 <= 0 && num2 <= 0 ||num2 <= 0 && num3 <= 0 || num1  <= 0 && num3 <=0)
        System.out.println("количество отрицательнных переменных ровно 2");
        else if (num1 <= 0 || num2 <= 0 || num3 <= 0)
        System.out.println("отрицательных переменных ровно 1");
    }
}
