import edu.princeton.cs.algs4.StdOut;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test
{
    public static void main(String [] args) throws UnknownHostException
    {
        InetAddress ia1=null;
        ia1=InetAddress.getByName("www.hitwh.edu.cn");
        StdOut.println(ia1);
    }
}
