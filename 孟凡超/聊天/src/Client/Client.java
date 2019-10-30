package Client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

 class Client extends Thread
{
    InputStream input = null;
    OutputStream output = null;
    BufferedReader bufferinput = null;
    Socket socket = null;
    private String name;
    private String password;

    public Client(String name, String password)
    {
        this.name = name;
        this.password = password;

        try
        {
            socket = new Socket("127.0.0.1", 9999);
            input = socket.getInputStream();
            output = socket.getOutputStream();
            //验证用户信息
            login();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args)
//    {
//        Client cl = new Client();
//    }

    public void login()
    {
        try
        {
            output.write(name.getBytes());
            output.flush();
            output.write(password.getBytes());
            output.flush();
            output.write("\r\n".getBytes());


            chat();
        } catch (UnknownHostException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally
        {
            if (socket != null)
            {
                try
                {
                    socket.close();
                } catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public void chat()
    {
        start();
        bufferinput = new BufferedReader(new InputStreamReader(input));
        String line;
        //获取消息
        try
        {
            while (true)
            {
                if ((line = bufferinput.readLine()) != null)
                {
                    System.out.println(line);
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (socket != null)
            {
                try
                {
                    socket.close();
                } catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public void run()
    {
        while (true)
        {
            BufferedReader brName = new BufferedReader(new InputStreamReader(System.in));
            String strName;
            //控制台在读入数据时并不会自动添加换行符号
            try
            {
                strName = brName.readLine() + "\r\n";
                output.write(strName.getBytes());
                output.flush();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}