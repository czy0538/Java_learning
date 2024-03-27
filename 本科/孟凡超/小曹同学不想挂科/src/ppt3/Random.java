package ppt3;

import edu.princeton.cs.algs4.StdOut;

public class Random
{

   public static int getRandomInt(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min); //不含最大值，含最小值
    }
    public static void main(String[] args)
    {
        for(int i=0;i<200;i++)
        StdOut.println(getRandomInt(10,20));
    }
}
