package PPT10;

import java.io.*;

public class ReaderAndWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("my.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        osw.write("哈尔滨工业大学");
        osw.close();
        FileInputStream fis = new FileInputStream("my.txt");
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        int c = 0;
        while ((c = isr.read()) != -1)
        {
            System.out.print((char) c);
        }
        isr.close();
    }
}
