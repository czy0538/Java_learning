package PPT10;

import edu.princeton.cs.algs4.StdOut;

import java.io.*;

public class StandardStream
{
    public static void echoIN()
    {
        try
        {
            var in = new FileInputStream("setOut.txt");
            System.setIn(in);

            while (true)
            {
                int i = System.in.read();
                char c = (char) i;

                if (i == -1)
                {

                    break;
                }
                System.out.print(c);
            }
            in.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void echoOut(String s)
    {
        char[] chs = s.toCharArray();

        try
        {
            var out = new PrintStream("setOut.txt");
            System.setOut(out);
            for (char ch : chs)
            {
                System.out.write(ch);
            }
            // System.out.write(-1);
            out.close();

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {


        echoOut("test heheda");
        System.setOut(System.err);
        echoIN();


    }
}
