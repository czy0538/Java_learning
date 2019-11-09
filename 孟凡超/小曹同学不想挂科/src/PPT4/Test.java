package PPT4;

import java.util.Arrays;

public class Test
{
    enum fuck
    {
        Oh,Year,hehe;
    }
    public static void main(String[] args)
    {
//        fuck f=fuck.Oh;
//        System.out.println(f);
//        int [][] a=new int[3][];
//        for(int i=0;i<3;i++)
//        {
//            a[i]=new int[4];
//        }
//        for(var i:fuck.values())
//        {
//            System.out.println(i);
//        }

        int []a={1,2,3,4};
        int []b={5,6,7};
        Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(a));
        var te=Arrays.toString(a);
        System.out.println(te.getClass());
        String as="fuck";

    }


}
