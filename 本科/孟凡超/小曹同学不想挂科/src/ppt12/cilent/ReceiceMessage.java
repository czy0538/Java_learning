package ppt12.cilent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiceMessage implements Runnable
{
    //author pzh hueedu
    /*
     * 拿到Socket的对应的接受流 死循环接受数据并打印在控制台上
     */
    private Socket s;
    private BufferedReader br = null;

    public ReceiceMessage(Socket s)
    {
        try
        {
            this.s = s;
            //信息读取流
            this.br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String recive()
    {//函数目的 把收到一行数据返回


        String result = null;
        try
        {
            while ((result = br.readLine()) != null)
            {
                System.out.println(s.toString() + "接受到了服务器端数据:" + result);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public void run()
    {//死循环 用于输出接受到的数据
        while (true)
        {
            recive();
        }
    }
}
