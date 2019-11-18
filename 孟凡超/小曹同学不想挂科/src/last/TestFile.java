package last;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile
{

public static void main(String[] args)
{
    try
    {
        var out=new FileOutputStream("test.txt",true);
        byte[] a="hello world".getBytes();
        out.write(a);
        out.close();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }

}


}
