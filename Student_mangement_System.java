import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
    String name ;
    String father_name ;
    public Student(){
        
        ArrayList <String> addStudent = new  ArrayList <String >();
        System.out.println("no of Studens ");
       
addStudent.add("qurban");
addStudent.add("fahad ");
//addStudent.add( String st1  = sc.nextLine());
System.out.println(addStudent);

    }
}
class Student_mangement_System {
    static{
        System.out.println("iam out of amin class ");
    }
    public static void main(String[] args) {
        System.out.println("i am in main class");
        Student s1 = new Student();
      
    }
}