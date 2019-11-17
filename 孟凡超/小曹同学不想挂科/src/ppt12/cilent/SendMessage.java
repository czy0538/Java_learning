package ppt12.cilent;

import java.io.*;
import java.net.Socket;

public class SendMessage implements Runnable {
    //author pzh hueedu
    private BufferedWriter bw = null;

    public SendMessage(Socket s){
        try {
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void Writer(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = null;
        String result = null;
        try {
            while((test=br.readLine())!=null){
                result = test;
                bw.write(result);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void run() {
        while(true){
            Writer();
        }
    }
}
