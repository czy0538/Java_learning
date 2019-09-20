//import java.util.Random;
//       import java.util.Scanner;
//
//public class One {
//    public static void main(String[] args) {
//        var input = new Scanner(System.in);
//        Random random = new Random();//默认构造方法
//        int n = input.nextInt();
//        var arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = random.nextInt();
//        }
//    }
//}


import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class One {

    public  static int[][] value(int n){
        int[][] trg=new int[n][];
        for(int i=0;i<trg.length;i++) {
            trg[i]=new int[i+1];
            trg[i][0]=1;
            trg[i][i]=1;
        }
        for(int i=2;i<n;i++) {
            for(int j=1;j<i;j++) {
                trg[i][j]=trg[i-1][j]+trg[i-1][j-1];
            }
        }
        return trg;
    }
    public static void print(int[][] trg,int n ) {//打印二位数组
        int k;//用来打印空格的变量
        for(int i=0;i<trg.length;i++) {
            for(k=n-i-1;k>0;k--) {
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++) {
               StdOut.print(trg[i][j]+" ");
            }
            StdOut.print("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入杨辉三角的行数");
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        print(value(n), n);
    }
}