package 线程交互;

public class Consumer implements Runnable
{
    Buffer buffer;
    int m;
    public Consumer(Buffer buffer,int m)
    {
        this.buffer=buffer;
        this.m=m;
    }
    public void run()
    {
        char c;
        for(int i=0;i<m; i++)

        {
            c=buffer.pop();
        }
        try
        {
            Thread.sleep((int)Math.random()*100);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
