package last;

import java.io.*;
import java.util.Scanner;

public class File
{
    public static void main(String [] args)
    {
        String filename;
        String target;
        Scanner input=new Scanner(System.in);
        filename=input.nextLine();
        target=input.nextLine();
        try
        {
            var in= new BufferedInputStream(new FileInputStream(filename));
            var out=new BufferedOutputStream(new FileOutputStream(target));
            while(true)
            {
                int i=in.read();
                if(i==-1)
                {
                    break;
                }
                out.write((char)i);
            }
            in.close();
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
