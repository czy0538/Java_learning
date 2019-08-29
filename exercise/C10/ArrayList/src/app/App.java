package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        System.out.println(array.size());
        System.out.println(array.contains(1));
        System.out.println(array.contains(0));
        System.out.println(array.indexOf(2));



    }
}