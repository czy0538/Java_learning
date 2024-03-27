package app;

import java.util.Scanner;

public class Hehe<T> implements Test<T> {
    private T a, b, c;
    static public Scanner input = new Scanner(System.in);

    @Override
    public void getValue() {
        // TODO Auto-generated method stub
        a = (T) input.next();
        b = (T) input.next();
        c = (T) input.next();
    }

    @Override
    public T returnVaule() {
        // TODO Auto-generated method stub
        return a;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        var test=new Hehe<Double> ();
        test.getValue();
        

    }

}