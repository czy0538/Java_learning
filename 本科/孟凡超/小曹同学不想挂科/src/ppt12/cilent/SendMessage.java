package ppt12.cilent;

import java.io.*;
import java.net.Socket;

public class SendMessage implements Runnable
{

    private BufferedWriter bw = null;
    private Socket s;

    public SendMessage(Socket s)
    {
        try
        {
            this.s=s;
            //消息发送流
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void Writer()
    {
        //从控制台读取信息
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = null;
        try
        {
            while ((result = br.readLine()) != null)
            {
                //标明发送方
                result=s.toString()+"说"+result;
                bw.write(result);
                bw.newLine();
                bw.flush();
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
            Writer();
        }
    }
}
