package last;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cilent
{
    public static void main(String[] args)
    {

        try
        {
            Socket ss = new Socket(InetAddress.getLocalHost(), 50000);
            var bw=new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
            var br=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            bw.write(InetAddress.getLocalHost().toString());
            bw.newLine();
            bw.flush();
            while(true)
            {
                String message=null;
                if((message=br.readLine())!=null)
                {
                    System.out.println(message);
                }
            }
        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
