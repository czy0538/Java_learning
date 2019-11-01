package ppt2;

public class 静态方法与变量
{
    public static int fuck;
    public static void printf()
    {
        System.out.println("fuck the world!");
        System.out.println("fuck:"+fuck);
    }
    public static void main(String [ ] args)
    {
        静态方法与变量.printf();
        静态方法与变量.fuck++;
        var t1=new 静态方法与变量();
        t1.printf();
        t1.fuck++;
        静态方法与变量.printf();
        

    }
}