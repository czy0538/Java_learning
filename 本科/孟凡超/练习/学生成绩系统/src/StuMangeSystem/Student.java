package StuMangeSystem;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student
{
    public String number;
    public String name;
    public String sex;
    public String team;
    public ArrayList<Grade> grades;

    @Contract(pure = true)
    public Student()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("number");
        number=input.nextLine();
        name=input.nextLine();
        sex=input.nextLine();
        team=input.nextLine();
        grades=new ArrayList<Grade>();
        setGrades();
    }
    public Student(ArrayList<Grade> grades)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("number");
        number=input.nextLine();
        name=input.nextLine();
        sex=input.nextLine();
        team=input.nextLine();
        this.grades=null;
    }

    public void setGrades()
    {
        var grades=new Grade();
    }

    @Contract(pure = true)
    public Student(String number, String name, String sex, String team, ArrayList<Grade> grades)
    {
        this.number = number;
        this.name = name;
        this.grades = grades;
        this.sex = sex;
        this.team = team;
    }

    @Override
    public String toString()
    {
        return "学号:" + number + ",姓名：" + name + "性别:" + sex + ",班级：" + team.toString() + ",成绩:" + grades.toString();
    }
}
