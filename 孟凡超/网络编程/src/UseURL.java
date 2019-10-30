import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class UseURL
{
    public static void main(String[] args)
    {
        try
        {
            URL url=new URL("https://www.hitwh.edu.cn");
            InputStreamReader isr=new InputStreamReader(url.openStream());
            var br=new BufferedReader(isr);
            String readString;
            while((readString=br.readLine())!=null)
            {
                System.out.println(readString);
            }
            br.close();;

        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
