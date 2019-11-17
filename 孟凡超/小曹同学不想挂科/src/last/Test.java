package last;

import edu.princeton.cs.algs4.StdOut;

public class Test
{
    public void change(String str)
    {
        str="computer";
    }
    public static void main(String [] args)
    {
        String str="fuck";
        Test test=new Test();
        test.change(str);
        StdOut.println(str);
    }
}
