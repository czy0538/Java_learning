package ppt2;

import edu.princeton.cs.algs4.StdOut;

public class 引用理解
{
    public static void main(String[ ] args)
    {
        Test t1;
        Test t2=new Test();
        t1=t2;
        t2.a=5;
        t1.print();
        t2.print();
        t1.a=233;
        t2.print();

        int a=24,b=13;
        StdOut.println(a&b);

    }
}

class Test
{
    int a;
    void print()
    {
        StdOut.println(a);
    }
}
