import java.util.Scanner;

public class Pay
{
    double price=0;
    double withholdRate=0;
    double payRate=0;
    double payment=0;
    private Scanner input;
    Pay()
    {
        input=new Scanner(System.in);
        price=input.nextDouble();
        withholdRate=input.nextDouble();
        payRate=input.nextDouble();
        payment=input.nextDouble();
    }
    double computePayment(double hour,double withholdRate,double payRate )
    {
        payment=hour*price*(1.0-withholdRate)*(1-payRate);
        return payment;
    }
    double computePayment(double price,double payRate)
    {
        double hour=input.nextDouble();
        payment=hour*price*(1.0-0.15)*(1-payRate);
        return payment;
    }
    double computePayment(double price)
    {
        double hour=input.nextDouble();
        payment=hour*price*(1.0-0.15)*(1-0.0465);
        return payment;
    }


}
