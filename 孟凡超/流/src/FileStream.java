import java.io.*;

public class FileStream
{
    void test1()
    {
        String filename=new String("D:\\A personal date\\GitHub\\Java_learning\\孟凡超\\流\\src\\FileStream.java");

        try
        {
            FileInputStream fis = new FileInputStream(filename);
            FileOutputStream fos=new FileOutputStream("test.txt");//会覆盖源文件
            int c;
            int i = 0;
            while ((c = fis.read()) != -1)
            {
                i++;
                System.out.print((char)c);
                fos.write(c);
            }
            System.out.println();
            System.out.println("len"+i);
            fis.close();
            fos.close();

        }
        catch (FileNotFoundException e)
        {
            System.err.println("发生异常："+e);
        }
        catch (IOException e)
        {
            System.err.println("发生异常："+e);
            e.printStackTrace();
        }
    }

  static public void test2() throws IOException
  {
        try{
            FileInputStream in=new FileInputStream("test.txt");
            FileOutputStream out=new FileOutputStream("file2.txt");
            InputStream bin=new BufferedInputStream(in);
            OutputStream bout=new BufferedOutputStream(out);
            int c;
            while((c=bin.read())!=-1)
            {
                bout.write(c);
            }
            bout.flush();
            in.close();
            out.close();
            bin.close();
            bout.close();
        } catch (IOException e)
        {

            e.printStackTrace();
        }


    }
    public static void test3() throws FileNotFoundException
    {
        class test1
        {
            int a=1;
            String b= new String("fuck");
            double c=3.14;
        }
        class test2
        {
            int a=2;
            String b= new String("fuck you");
            double c=2.33;
        }
        var t1=new test1();
        var t2=new test2();
        try
        {
            FileInputStream in=new FileInputStream("test.txt");
            FileOutputStream out=new FileOutputStream("file2.txt");
            var bin=new DataInputStream(in);
            var bout=new DataOutputStream(out);

            bout.writeInt(t1.a);
            bout.writeUTF(t1.b);
            bout.writeDouble(t1.c);
            bout.writeInt(t2.a);
            bout.writeUTF(t2.b);
            bout.writeDouble(t2.c);

            while(true)
            {
                bin.readInt();
                bin.readUTF();
                bin.readDouble();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws IOException
    {
        test2();




    }
}
