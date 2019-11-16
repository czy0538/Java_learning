package PPT10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilrStream
{
    public static void main(String[] args)
    {
        String filename;
        Scanner input = new Scanner(System.in);
        filename = input.nextLine();
        try
        {
            FileInputStream in = new FileInputStream(filename);

            StringBuffer s = new StringBuffer();
            FileOutputStream out = new FileOutputStream(filename + ".c");

            //Scanner方法读取
            Scanner fileInput=new Scanner(in);
            while(fileInput.hasNextLine())
            {
                s.append(fileInput.nextLine());
            }

            //read方法读取
            while (true)
            {
                int i = in.read();
                if (i == -1)
                {
                    break;
                }
                s.append((char) i);
            }
            System.out.println(s);

            byte b[] = s.toString().getBytes();
            //写法1
            for (var i : b)
            {
                out.write(i);
            }
            //写法2
            out.write(b, 0, b.length);


            in.close();
            out.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
