package 线程的控制;

public class InterruptDemo
{
    public static void main(String [] args)
    {
        Thread thread=new LeapYearPrinter();
        thread.start();
        try
        {
            Thread.sleep(5);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

class LeapYearPrinter extends Thread
{
    public void run()
    {
        int year=2000;
        System.out.println("闰年包括");
        while(true)
        {
            if(year%4==0 && year%100!=0 || year%400==0)
            {
                System.out.println(year);
            }
            if(isInterrupted())
            {
                System.out.println("线程被中断");
                return;
            }
            year++;
        }
    }
}