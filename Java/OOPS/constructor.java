package OOPS;

import java.lang.reflect.Constructor;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Aryan");
        s1.studentid = 1234;
        Student s2 = new Student(s1);
        s1.name = "ram";
        System.out.println(s2.name);
        System.out.println(s2.studentid);
        Student s3 = new Student(1221);
    }
}

class Student{
    Student(){
        System.out.println("Student class is called");
        
    } 
    Student(int studentid){
        this.studentid = studentid;
        System.out.println("object s3 is called");
    }
    Student(String name){
        this.name = name;
    }

    //  COPY CONSTRUCTOR
    Student(Student s1){
        this.name = s1.name;
        this.studentid = s1.studentid;
    }
    String name;
    int studentid;
}