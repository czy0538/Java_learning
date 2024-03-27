package last;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        try
        {

            ServerSocket server = new ServerSocket(50000);
            while (true)
            {
                Socket s = server.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                String message = null;

                if ((message = br.readLine()) != null)
                {
                    bw.write("welcome to" + message);
                    bw.newLine();
                    bw.flush();
                    System.out.println(message + "is connecting");


                }

            }


        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
