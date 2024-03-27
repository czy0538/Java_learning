package 线程交互;

import java.util.Map;

public class Producer implements Runnable
{
    Buffer buffer;
    int m;
    public Producer(Buffer buffer,int m)
    {
        this.buffer=buffer;
        this.m=m;

    }
    @Override
    public void run()
    {
        char c;
        for(int i=0;i<20;i++)
        {
            c=(char)(Math.random()*26+'A');
            buffer.put(c);
            try
            {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
