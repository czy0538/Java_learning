package ppt12;

import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class ReadURL
{
    public static void main(String[ ] args )
    {
        try
        {
            var url=new URL("http://172.26.50.21/login");
            var isr= new InputStreamReader(url.openStream());
            var br=new BufferedReader(isr);
            String readstring;
            while((readstring=br.readLine())!=null)
            {
                StdOut.println(readstring);
            }
            br.close();
            isr.close();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
