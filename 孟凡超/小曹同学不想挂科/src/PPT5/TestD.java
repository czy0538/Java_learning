
public class TestD
{
    public static void main(String[] args)
    {
        method(new B());
        method(new A());
    }

    public static void method(A a)
    {
        a.print();
    }
}

class A
{
    int data;

    public A()
    {
        add(2);
    }

    public A(int k)
    {
        add(k);
    }

    public void add(int i)
    {
        data += i;
    }

    public void print()
    {
        System.out.println("data=" + data);
    }
}

class B extends A
{
    public B()
    { super(1);
        add(1);

    }

    public void add(int i)
    {
        data += i * 3;
    }
}