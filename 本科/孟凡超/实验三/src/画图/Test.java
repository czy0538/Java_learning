package 画图;

import edu.princeton.cs.algs4.StdOut;

public class Test
{

    public static void main(String[] args)
    {
        Triangle triangle=new Triangle(3,4,5);
        Circle circle=new Circle(3);
        Trapezoid trapezoid=new Trapezoid(3,3,3);
        StdOut.println(triangle.getPerimeter());
        StdOut.println(triangle.getArea());
        StdOut.println(circle.getArea());
        StdOut.println(circle.getPerimeter());
        StdOut.println(trapezoid.getArea());

    }

}

class Triangle
{
    private double a, b, c, perimeter, area;

    public Triangle()
    {
    }

    public Triangle(double a, double b, double c)//构造函数
    {
        setA(a);
        setB(b);
        setC(c);
    }

    public double getPerimeter()//求边长
    {
        if (isTriangle())
            return perimeter = a + b + c;
        else return -1;
    }

    public double getArea()//求面积
    {
        if (isTriangle())
        {
            double p = getPerimeter() / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return area;
        }
        else return -1;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public void setC(double c)
    {
        this.c = c;
    }

    private boolean isTriangle()
    {
        return a + b > c && a + c > b && b + c > a;
    }//判断是否为三角形

    public double getB()
    {
        return b;
    }

    public double getA()
    {
        return a;
    }

    public double getC()
    {
        return c;
    }
}

class Trapezoid
{
    private double top, bottom, height, area;

    public Trapezoid()
    {
    }
    //构造函数
    public Trapezoid(double top, double bottom, double height)
    {
        setBottom(bottom);
        setHeight(height);
        setTop(top);
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setBottom(double bottom)
    {
        this.bottom = bottom;
    }

    public void setTop(double top)
    {
        this.top = top;
    }

    public double getArea()
    {
        return area = (top + bottom) * height / 2;
    }
}

class Circle
{
    private double r, perimeter, area;

    public Circle()
    {
    }

    public Circle(double r)
    {
        setR(r);
    }

    public double getArea()
    {
        return area = Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter()
    {
        return perimeter = Math.PI * 2 * r;
    }

    public void setR(double r)
    {
        this.r = r;
    }
}