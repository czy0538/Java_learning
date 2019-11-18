package MySocket;

import PPT7.MenuDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server
{
    public static void main(String[] args)
    {
        //构造函数只承担构造功能，别总是让她干别的emm
        Vector clients=new Vector<Socket>();

        try
        {
            ServerSocket ss=new ServerSocket(2333);
            while(true)
            {
                Socket s=ss.accept();
                if(s!=null)
                {

                    clients.add(s);
                    new Message(clients,s).start();
                }
            }



        }
        catch (IOException e )
        {
            e.printStackTrace();
        }

    }

}

class Message extends Thread
{

    Vector<Socket> clients;
    Socket s;
    Message(Vector<Socket> clients,Socket s)
    {
        this.clients=clients;
        this.s=s;
    }
    public void run()
    {
        BufferedReader br= null;
        try
        {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        while(true)
        {
            String message=null;
            try
            {
                if((message=br.readLine())!=null)
                {
                    System.out.println(message);
                    for(var t:clients)
                    {
                        if(!s.equals(t))
                        {
                            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(t.getOutputStream()));
                            bw.write(message);
                            bw.newLine();
                            bw.flush();
                        }
                    }
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}