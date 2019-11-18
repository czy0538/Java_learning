package PPT5;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

import java.io.ObjectStreamException;

public class Test
{
    public static void main(String[] args)
    {
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();
        A e = new E();
        E ee = new E();

        a.printf(b);
        a.printf(c);


////        a.printf();
////        b.printf();
////        c.printf();
////        d.printf();
////        e.printf();
////        ee.printf();
//        A[] abcdef=new A[7];
//
//        abcdef[0]=new A();
//        abcdef[1]=new B();
//        abcdef[2]=new C();
//        abcdef[3]=new D();
//        abcdef[4]=new E();
//        for(int i=0;i<5;i++)
//        {
//            abcdef[i].printf();
//        }
    }
}

class A
{
    void printf()
    {
        StdOut.println("A");
    }

    void printf(A e)
    {
        if (e instanceof Object&&e instanceof A)
        {
            StdOut.println("hehe");
        }
        if (e instanceof B)
        {
            StdOut.println(e.getClass() + "is b");
        }
        else if (e instanceof C)
        {
            StdOut.println(e.getClass() + "is c");
        }

    }

}

class B extends A
{
    void printf()
    {
        StdOut.println("B");
    }

}

class C extends B
{
    void printf()
    {
        StdOut.println("C");
    }

}

class D extends C
{

}

class E extends D
{

    void printf()
    {
        StdOut.println("E");
    }


}
