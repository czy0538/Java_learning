package StuMangeSystem;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class Course
{
    public String code;
    public String name;
    public float credit;

    public Course()
    {
        StdOut.print("请输入课程序号");
        code = StdIn.readString();
        StdOut.print("请输入课程名");
        name = StdIn.readString();
        StdOut.print("请输入学分");
        credit = StdIn.readFloat();
    }
    public String toString()
    {
        return "课程序号："+code+",课程名:"+name+",学分:"+credit;
    }
    public static void main(String [] args)
    {
        var course=new Course();
        StdOut.println(course.toString());
    }

}
