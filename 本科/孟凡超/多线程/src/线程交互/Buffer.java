package 线程交互;

public class Buffer
{
    private int size;
    private int index;
    private char stack[];

    public Buffer(int n)
    {
        size = n;
        index = 0;
        stack = new char[size];
    }

    public synchronized void put(char c)
    {
        while (index == stack.length)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        notify();

        stack[index]=c;
        System.out.println("put:"+c);
        index++;
    }

    public synchronized char pop()
    {
        while (index==0)
        {
            try{
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        notify();
        index--;
        System.out.println("pop"+stack[index]);
        return stack[index];
    }

}
