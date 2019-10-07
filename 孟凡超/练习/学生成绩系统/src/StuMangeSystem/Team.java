package StuMangeSystem;

import java.util.ArrayList;

public class Team {
   public ArrayList<Student> students;
   public  Team()
   {

   };
   public  Team(ArrayList<Student> students)
   {
       this.students=students;
   }
   public void addStudent()
   {
       Student student=new Student();
       students.add(student);
   }
}
