package ppt12.server;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class DispatcherMessage implements Runnable{
    //author pzh hueedu
    private Socket s = null;
    private BufferedReader br = null;
    private List<Socket> socketlist = null;
    public DispatcherMessage(Socket s,List<Socket> socketlist) {
        this.socketlist = socketlist;
        this.s = s;
        try {
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void DispathcherMessage(){
        String test = null;
        String result = null;
        try {
            while((test=br.readLine())!=null){
                for(Socket allsocket:socketlist){
                    if(!s.equals(allsocket)){
                        result = test;
                        System.out.println(result+"服务器接受端测试");
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(allsocket.getOutputStream()));
                        bw.write(result);
                        bw.newLine();
                        bw.flush();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void run() {
        while(true){
            DispathcherMessage();
        }
    }
}
