package app;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        var s=new String("10");
        System.out.println(factorial(Integer.Int));
    }

    public static BigInteger factorial(long n)
    {
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}