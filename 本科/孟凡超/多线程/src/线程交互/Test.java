package 线程交互;

public class Test
{
    public static void main(String[] args)
    {
        Buffer buffer=new Buffer(20);
        Runnable producer=new Producer(buffer,20);
        Runnable consumer =new Consumer(buffer,20);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
