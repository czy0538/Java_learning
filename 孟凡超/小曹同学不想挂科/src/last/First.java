package last;

import java.util.Arrays;

public class First
{
    public static void main(String[] args)
    {
        int n = 0;
        int[] num = new int[10];
        for (int i = 0; i < 10; i++)
        {
            int t = num[i] = (int) (Math.random() * 100);
            if (t == 1)
                ;
            if (t == 2)
            {
                n++;
            }
            else
            {
                int j;
                for (j = 2; j < t; j++)
                {
                    if (t % j == 0)
                    {
                        break;
                    }
                }
                if (j == t)
                {
                    n++;
                }
            }

        }
        System.out.println(Arrays.toString(num));
        System.out.println(n);
    }
}

