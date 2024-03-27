package ppt12;

import edu.princeton.cs.algs4.StdOut;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet
{
    public static void main(String[] args)
    {
        InetAddress ia1 = null;
        InetAddress ia2 = null;
        InetAddress ia3[] = null;
        try
        {
            ia1 = InetAddress.getByName("www.pornhub.com");//通过机器名、ip、DSN域名获取
            ia2 = InetAddress.getLocalHost();//得到本机
            ia3 = InetAddress.getAllByName("www.91porn.com");
        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        }

        StdOut.println(ia1.toString());
        StdOut.println(ia1.getHostName()+ia1.getHostAddress());
        //上面两句等价
        StdOut.println(ia2.toString());
        for (var i : ia3)
        {
            StdOut.println(i.toString());
        }
    }

}
