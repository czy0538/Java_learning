package ppt12.server;

import java.io.*;
import java.net.Socket;
import java.util.Vector;

public class DispatcherMessage implements Runnable
{
    //消息广播
    private Socket s = null;
    private BufferedReader br = null;
    private Vector<Socket> socketlist = null;

    public DispatcherMessage(Socket s, Vector<Socket> socketlist)
    {
        this.socketlist = socketlist;
        this.s = s;
        try
        {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void DispathcherMessage()
    {

        String result = null;
        try
        {
            while ((result = br.readLine()) != null)
            {
                //对每个socket进行广播
                for (Socket allsocket : socketlist)
                {
                    //向除了s（发送端）之外的所有接收端发送消息
                    if (!s.equals(allsocket))
                    {
                        //服务器端的输出
                        System.out.println(allsocket.toString()+"收到了:"+result );

                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(allsocket.getOutputStream()));
                        bw.write(result);
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

    public void run()
    {
        while (true)
        {
            DispathcherMessage();
        }
    }
}
