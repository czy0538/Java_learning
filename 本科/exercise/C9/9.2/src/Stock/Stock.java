package Stock;

import java.util.Scanner;

public class Stock {
    private String symbol=new String();
    private String name=new String();
    private double previousClosingPrice;
    private double currentPrice;
    public Scanner input = new Scanner(System.in);

    Stock(String symbol,String name)
    {

        this.name=name;
        this.symbol=symbol;
        System.out.print("请输入股票昨日价格：");
        previousClosingPrice=input.nextDouble();
        System.out.print("请输入股票今日价格：");
        currentPrice=input.nextDouble();

    }
    double getChangePercent()
    {
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Stock s=new Stock("oral","hehe");
        System.out.println(s.getChangePercent());

    }
}