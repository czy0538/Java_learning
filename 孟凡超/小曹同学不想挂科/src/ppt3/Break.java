package ppt3;

public class Break
{
    public static void main(String[] args)
    {
        int sum=0;
        fuck:for(int i=0;i<1000;i++)
        {
            for(int j=0;j<10;j++)
            {
                sum++;
                if(j==9)
                    break;
                    //break fuck;

            }
        }
        System.out.println(sum);
    }
}
