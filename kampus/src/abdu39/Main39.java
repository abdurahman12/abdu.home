package abdu39;

public class Main39 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        double art=Math .pow(a,4)+Math .pow(b,6);
        while (a<=b){
            art =art *a*b;
            a++;
            System.out.println("сумма квадратных чисел"+ art );
        }
    }

}