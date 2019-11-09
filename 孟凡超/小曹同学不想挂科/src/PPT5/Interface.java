package PPT5;

import edu.princeton.cs.algs4.StdOut;

interface Storage
{
    int num = 10;

    void setNum(int a);

    void setNum();

    void printf();
}

public class Interface implements Storage
{

    int a;
    @Override
    public void setNum(int a)
    {
        this.a=a;
    }

    @Override
    public void setNum()
    {
        a=num;
    }

    @Override
    public void printf()
    {
        StdOut.println(a);
    }
    public static void main(String[] args)
    {
        var t=new Interface();
        t.printf();
        t.setNum();
        t.printf();
        t.setNum(23);
        t.printf();
    }
} 