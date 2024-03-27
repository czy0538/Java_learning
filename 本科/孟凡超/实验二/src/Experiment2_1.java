import edu.princeton.cs.algs4.StdIn;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Experiment2_1
{
    public static void first()
    {
        int n;
        double j = 1.0;
        double ans = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; i++, j += 2)
        {
            ans += 1 / j;
        }
        System.out.println(ans);
    }

    //求最大公约数
    public static int second_1(int m,int n)
    {
        Scanner input = new Scanner(System.in);

        if (m < n)
        {
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0)
        {
            int temp = m % n;
            m = n;
            n = temp;
        }
        System.out.println("最大公约数为"+n);
        return n;
    }

    public static void second_2()
    {
        Scanner input = new Scanner(System.in);
        int m, n;
        m = input.nextInt();
        n = input.nextInt();
        int temp=m * n / second_1(m,n);
        System.out.println("最小公倍数为"+temp);

    }

    public static void third()
    {
        int a,b,c;
        for( int i=100; i<1000; i++ )
        {
            a = i / 100;
            b = (i-a*100) / 10;
            c = i % 10;
            if(i == Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3))
                System.out.println(i);
        }
    }

    public static void forth()
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum=0;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    sum+=j;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }

    public static void fifth()
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        if(n==1)
        {
            ;
        }
        if(n==2)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(2);
            for(int i=3;i<n;i++)
            {
                int j=2;
                for(;j<i;j++)
                {
                    if (i%j==0)
                        break;
                }
                if(j==i)
                {
                    System.out.println(i);
                }
            }
        }

    }

    public static void sixth()
    {
        Map<Integer,Integer> num= new HashMap<>();
        for(int i=0;i<1000;i++)
        {
            //int temp= StdIn.readInt();
            int temp= ThreadLocalRandom.current().nextInt(1, 101);
            if(num.getOrDefault(temp,0)==0)
            {
                num.put(temp,1);
            }
            else
            {
               int t= num.getOrDefault(temp,0)+1;
               num.put(temp,t);
            }
        }
        for (Integer integer : num.keySet())
        {
            int key = (int) integer;
            System.out.println("key:" + key + " value:" + num.get(key));

        }
    }

    public static void seventh()
    {
        int min,max,n;
        Scanner input=new Scanner(System.in);
        min=input.nextInt();
        max=input.nextInt();
        n=input.nextInt();
        Map<Integer,Integer> num= new HashMap<>();
        while(num.size()!=n)
        {
            num.put(ThreadLocalRandom.current().nextInt(min, max+1),0);
        }
        for (Integer integer : num.keySet())
        {
            int key = (int) integer;
            System.out.println("key:" + key);

        }
    }


    public static void main(String[] args)
    {
        //Experiment2_1.first();
        //Experiment2_1.second_2();
        //Experiment2_1.third();
        //Experiment2_1.forth();
        //Experiment2_1.fifth();
        //Experiment2_1.sixth();
        Experiment2_1.seventh();
    }
}
