package ppt3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Year
{
    public static void days()
    {
        int year,month;
        StdOut.println("分别输入年月：");
        year=StdIn.readInt();
        month=StdIn.readInt();
        try{
            if (year<=0)
            {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e)
        {
            StdOut.println("年份不能小于0,请重新输入");
            year= StdIn.readInt();
        }
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                StdOut.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                StdOut.println(30);
                break;
            case 2:
                if (isLeapYear(year))
                {
                    StdOut.println(28);
                }
                else StdOut.println(29);
                break;
            default:StdOut.println("你家有这个月份？？？");
        }

    }
    public static boolean isLeapYear(int y)
    {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0 && y % 3200 != 0);

    }
    public static void main(String[] args)
    {
        Year.days();

    }
}
