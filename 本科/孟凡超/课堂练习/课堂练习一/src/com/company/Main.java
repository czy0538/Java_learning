package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String num;
        num = input.nextLine();
        if (num.length() != 5) {
            System.out.println("error");
        } else {
            if (num.charAt(4) == '1' || num.charAt(4) == '3' || num.charAt(4) == '9') {
                System.out.println("三等奖");
            } else if (num.endsWith("29") || num.endsWith("46") || num.endsWith("21")) {
                System.out.println("二等奖");
            } else if (num.endsWith("875") || num.endsWith("326") || num.endsWith("596")) {
                System.out.println("一等奖");
            }else{
                System.out.println("没中奖");
            }
        }


    }
}
