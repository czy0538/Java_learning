package 线程的控制;

public class JoinDemo
{
    static int sum = 0;

    public static void main(String[] args) throws InterruptedException
    {
        int[] arr = new int[10];
        Thread producer = new Thread(new Producer(arr));
        producer.start();
        Thread worker = new Thread(new Worker(arr, producer));
        worker.start();
        Thread printTask = new Thread(new PrintTask(worker));
        printTask.start();
        printTask.join();
        int sum1 = 0;
        for (var value : arr)
        {
            sum1 += value;
        }
        if (sum == sum1)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("false");
        }
    }


}

class Producer implements Runnable
{
    int[] arr;

    public Producer(int[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void run()
    {
        System.out.println("初始化。。。");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
    }

}

class Worker implements Runnable
{
    int[] arr;
    Thread thread;

    public Worker(int[] arr, Thread thread)
    {
        this.arr = arr;
        this.thread = thread;
    }

    @Override
    public void run()
    {
        try
        {
            thread.join();//让producter先运行
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("开始计算...");
        int sum = 0;
        for (var value : arr)
        {
            sum += value;
        }
        JoinDemo.sum = sum;
    }
}

class PrintTask implements Runnable
{
    Thread thread;

    public PrintTask(Thread thread)
    {
        this.thread = thread;
    }

    @Override
    public void run()
    {
        try
        {
            thread.join();//让worker先执行

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("sum=" + JoinDemo.sum);
    }

}