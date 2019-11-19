package ppt11;

public class MySynchorized
{
    int total;
    synchronized void push()
    {
       total++;
    }
    synchronized void pop()
    {
        total--;
    }
    public static void main(String[ ] args)
    {

    }

}
class Push extends Thread
{
    public void run()
    {

    }
}
