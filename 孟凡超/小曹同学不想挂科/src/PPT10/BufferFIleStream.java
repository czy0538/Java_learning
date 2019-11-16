package PPT10;

import java.io.*;

public class BufferFIleStream
{
    public static void main(String[] args)
    {
        try
        {
            var in=new FileInputStream("setOut.txt");
            var out=new FileOutputStream("setOut.txt.c");
            var bin=new BufferedInputStream(in,2);
            var bout=new BufferedOutputStream(out,233);
            while(true)
            {
                int i = bin.read();
                if (i == -1)
                {
                    break;
                }
                bout.write(i);
            }
            bout.flush();
            in.close();
            bin.close();
            bout.close();
            out.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
