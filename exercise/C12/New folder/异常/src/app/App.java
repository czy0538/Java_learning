package app;

import java.util.Scanner;

public class App {
    public static int quotient(int num1,int num2) {
        if(num2==0)
        {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return num1/num2;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        var input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        try {
            int result = quotient(num1,num2);
            System.out.println(result);
        } catch (ArithmeticException ex) {
            //TODO: handle exception
            System.out.println("hehe");
        }

    }
}