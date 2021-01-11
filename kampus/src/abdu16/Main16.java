package abdu16;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("видите число");
        int number = task.nextInt();
         if (number >0)
        {
            number++;
        }
         else if (number < 0);{
             number =number -10;
            System.out.println(+number+ "");


        }
    }

}