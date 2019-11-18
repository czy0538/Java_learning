package PPT4;

import java.util.ArrayList;
import java.util.Collections;

public class Iter
{
    public static void main(String[] args)
    {
        var num=new ArrayList<Integer>();

        for(int i=0;i<10;i++)
        {
            num.add((int) (Math.random() * (100 - 1) + 1));
        }
        var iter=num.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        Collections.sort(num);
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
    }
}
