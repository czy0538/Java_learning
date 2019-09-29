package StuMangeSystem;

import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Grade
{
    Student student;
    Course course;
    float score;
    @Contract(pure = true)
    public Grade()
    {
        Scanner input=new Scanner(System.in);
        StdOut.println("请输入成绩");
        score=input.nextFloat();
        course=new Course();
        student=new Student(null);

    }
    public  Grade(Student student,Course course,float score)
    {
        this.student=student;
        this.course=course;
        this.score=score;
    }

    @Override
    public String toString()
    {
        return student.toString()+","+course.toString()+",成绩:"+score;
    }
}
