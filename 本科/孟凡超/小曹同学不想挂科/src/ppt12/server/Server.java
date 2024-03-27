package ppt12.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server
{

    //存储多个服务器的地址
    private static Vector<Socket> socketlist = new Vector<Socket>();

    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(50000);//设置socket服务器端口
            while(true){
                Socket s = ss.accept();//接受连接并返回socket对象
                socketlist.add(s);
                //打印socketlist中全部的元素，并调用每个socketlist的toString方法
                System.out.println(socketlist);
                new Thread(new DispatcherMessage(s,socketlist)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
