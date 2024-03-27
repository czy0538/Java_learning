package PPT5;

import edu.princeton.cs.algs4.StdOut;

public class TestStatic
{
   public static void main(String[] args)
   {
       StdOut.println(FUck.dd);
       FUck.add();
       StdOut.println(FUck.dd);
   }

}

 class FUck
{
    static int dd=0;
    static void add()
    {
        ++dd;
    }
}
