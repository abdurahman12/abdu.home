package Main18;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("видите целое число");
        double a=sc.nextDouble();
        if (a>0) {
            a++;
        }
        else if (a<0) {
            a = a - 2;
        }
        else if (a==0) {
            a = 10;
        }
        System.out.println("вы ввели число "+ a);
        }
    }

