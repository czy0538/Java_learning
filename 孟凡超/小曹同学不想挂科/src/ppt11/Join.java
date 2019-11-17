package ppt11;

import edu.princeton.cs.algs4.StdOut;

public class Join
{
    public static void main(String[] args)
    {
        Thread c = new Thread(() -> StdOut.println("this is c"));
        var a = new Thread(new A(c));
        var b = new Thread(new B(a));
        a.start();
        b.start();
        c.start();

    }

}

class A implements Runnable
{
    Thread thread;

    public A(Thread thread)

    {
        this.thread = thread;
    }

    @Override
    public void run()
    {
        StdOut.println("A.start");
        try
        {
            thread.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        StdOut.println("A.end");

    }

}

class B implements Runnable
{
    Thread thread;

    public B(Thread thread)
    {
        this.thread = thread;
    }

    @Override
    public void run()
    {
        StdOut.println("B.start");
        try
        {
            thread.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        StdOut.println("B.end");
    }
}