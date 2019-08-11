import java.util.ArrayList;

public class Notebook
{
	private ArrayList<String> notes= new ArrayList<String>();
	//private int size=0;
	public void add(String s)
	{
		notes.add(s);
		//size++;
	}
	public int getSize()
	{
		return notes.size();
	}

	public String getNote(int index)
	{

	}

	public bool removeNote(int index)
	{

	}

	public String [] list()
	{

	}

	public static void main(String[] args)
	{
		Notebook nb=new Notebook();
		nb.add("first");
		nb.add("Second");
		System.out.println(nb.getSize());
	}
}
