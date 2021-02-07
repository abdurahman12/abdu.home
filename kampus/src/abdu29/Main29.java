package abdu29;

import java.util.Scanner;
public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double d = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double f = sc.nextDouble() ;
        System.out.println("Введите третью переменную");
        double r = sc.nextDouble();
        if (d<f)
            if (d>r)
                System.out.println("наименьшая "+d);
            if (f>d)
                if(f>r)
                    System.out.println("наименьшую"+f);


    }
}
