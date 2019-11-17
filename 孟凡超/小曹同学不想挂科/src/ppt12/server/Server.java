package ppt12.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server
{

    private static List<Socket> socketlist = Collections.synchronizedList(new ArrayList<Socket>());
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(50000);
            while(true){
                Socket s = ss.accept();//阻塞式方式。

                socketlist.add(s);
                System.out.println(socketlist);
                new Thread(new DispatcherMessage(s,socketlist)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
