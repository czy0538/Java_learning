package app;

import java.util.ArrayList;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector vec = new Vector();
        for (int i = 0; i <= 3; i++) {
            vec.addElement(i);
        }
        for (var i : vec) {
            System.out.println(i);
        }
        System.out.println();
        vec.insertElementAt("hehe", 1);
        for (var i : vec) {
            System.out.println(i);
        }
        System.out.println();
        vec.setElementAt("begin",0);
        for (var i : vec) {
            System.out.println(i);
        }
        System.out.println();
        vec.removeElement(0);
        for (var i : vec) {
            System.out.println(i);
        }
        System.out.println();
        vec.removeElementAt(0);
        for (var i : vec) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        System.out.println(arr.get(0));

    }

}