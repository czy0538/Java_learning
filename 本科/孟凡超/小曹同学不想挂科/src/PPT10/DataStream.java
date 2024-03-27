package PPT10;

import edu.princeton.cs.algs4.StdOut;

import java.io.*;

public class DataStream
{
    public static void main(String[] args)
    {
        try
        {
            var in=new FileInputStream("setOut.txt");
            var out=new FileOutputStream("setOut.txt");
            var din=new DataInputStream(in);
            var dout=new DataOutputStream(out);
//            int a=din.readInt();
//            double b=din.readDouble();
            dout.writeUTF("testUTF");
            dout.writeInt(23);
            dout.writeDouble(233.3);



            String c=din.readUTF();
            int a=din.readInt();
            double b=din.readDouble();
            StdOut.println(a);
            StdOut.println(b);
            StdOut.println(c);

            in.close();
            din.close();
            out.close();
            dout.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
