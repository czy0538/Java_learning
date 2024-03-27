package last;

import javax.swing.plaf.synth.SynthTextAreaUI;

//enum Weekend
//{
//    Monday,Tuesday,Wednesday,Thurdesday,Friday,Saturday,Sunday
//}

public class MyThread
{
    public static void main(String[] args)
    {
//        Weekend [] weekend=Weekend.values();
//        Weekend w = null;
//        for(var i:weekend)
//        {
//            System.out.println(i);
//            switch (i)
//            {
//                case Monday:
//                default:
//                    System.out.println("test");
//            }
//        }


    }

}
class A implements Runnable
{
    Thread thread;
    A(Thread thread)
    {
        this.thread=thread;
    }

    public void run()
    {
        System.out.println("A start");
        try
        {
            thread.join();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("A end");
    }
}
class B implements Runnable
{
    Thread thread;
    B(Thread thread)
    {
        this.thread=thread;
    }

    public void run()
    {
        System.out.println("B start");
        try
        {
            thread.join();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("B end");
    }
}

