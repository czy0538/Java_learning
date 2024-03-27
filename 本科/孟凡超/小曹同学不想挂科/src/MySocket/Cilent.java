package MySocket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent
{
    Socket ss;
    BufferedReader br;
    BufferedWriter bw;

    public  static void main(String [] args)
    {
        new Cilent();
    }
    Cilent()
    {
        try
        {
            ss = new Socket(InetAddress.getLocalHost(), 2333);
            br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
            bw.write(ss.toString() + "上线了：" );
            bw.newLine();
            bw.flush();
            new Thread(new SendMessage()).start();
            new ReceiveMessage().start();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    class SendMessage implements Runnable
    {

        @Override
        public void run()
        {
            while (true)
            {
                Scanner input = new Scanner(System.in);
                String s = null;
                try
                {
                    while (input.hasNextLine())
                    {
                        s = input.nextLine();
                        bw.write(ss.toString() + "说：" + s);
                        bw.newLine();
                        bw.flush();
                    }

                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    class ReceiveMessage extends Thread
    {
        public void run()
        {
            String message = null;
            try
            {
                while (true)
                {
                    message = br.readLine();
                    if (message != null)
                    {
                        System.out.println(message);
                    }

                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


}

