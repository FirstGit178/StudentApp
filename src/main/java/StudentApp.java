package ie.atu.week3;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args)
    {
        Scanner studentInput = new Scanner(System.in);
        //get details of first student
        System.out.println("Please enter first students name: ");
        String studentName = studentInput.nextLine();

        System.out.println("Please enter first students email: ");
        String studentEmail = studentInput.nextLine();

        System.out.println("Please enter first students course: ");
        String studentCourse = studentInput.nextLine();

        Student firstStudent = new Student();
        firstStudent.setNameStudent(studentName);
        firstStudent.setEmailStudent(studentEmail);
        firstStudent.setCourseStudent(studentCourse);
    }
}