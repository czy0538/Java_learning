package PPT5;

import edu.princeton.cs.algs4.StdOut;

public class TTest
{
    static class fuck
    {
        static void print()
        {
            StdOut.println("我是静态成员类");
        }
    }

    public static void main(String[] args)
    {
        TTest.fuck hehe=new TTest.fuck();
        hehe.print();
        TTest.fuck.print();
    }
}
