package ppt12.cilent;

import java.net.InetAddress;
import java.net.Socket;

public class Cilent
{
    /*
     * 任务：
     * 1.为每一个Client用户创建一个Socket
     * 2.开启发送线程
     * 3.开启接受线程
     */
    public static void main(String[] args) throws Exception
    {
        //创建Socket
        Socket ss = new Socket(InetAddress.getLocalHost(), 50000);
        //接收消息线程
        new Thread(new ReceiceMessage(ss)).start();
        //发送消息线程
        new Thread(new SendMessage(ss)).start();
    }
}

