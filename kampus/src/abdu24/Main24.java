package abdu24;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner top = new Scanner(System.in);
        int A = top.nextInt();
        Scanner top2 = new Scanner(System.in);
        int B = top2.nextInt();
        if (A>B) {
            System.out.println("новое значение A =" + A + "новое значение B =" + B);
        }
        if (B>A) {
            A = B;
            B = A;
            System.out.println("новое значение B = "+"новое значение A=" + A);
        }
    }
}
