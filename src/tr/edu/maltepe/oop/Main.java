package tr.edu.maltepe.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Professor professor = new Professor(12345,"Ensar","Gül",237);
        Student student = new Student(12345,"emirn","topel","AA");
        System.out.println(professor.getName() + " " +professor.getSurName() + " " + professor.getId());
        System.out.println(student.getName() + " " + student.getSurName()+ " " + student.getId());
        System.out.println(student.getLetterGrade());
        System.out.println(professor.getClass());


    }
}