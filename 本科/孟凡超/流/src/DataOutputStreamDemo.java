import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataOutputStreamDemo
{
    class Book
    {
        int number;
        String name;
        double price;

        public Book(int number, String name, double price)
        {
            this.name = name;
            this.number = number;
            this.price = price;
        }
    }

    static ArrayList<Book> books = new ArrayList<>();

    public void addBooks()
    {


    }
    public void readData(String filename)
    {
        FileInputStream fis;
        DataInputStream in;
        try
        {
            fis=new FileInputStream(filename);
            in=new DataInputStream(fis);


        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
