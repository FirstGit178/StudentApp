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

        //get details of second student
        System.out.println("Please enter second students name: ");
        studentName = studentInput.nextLine();

        System.out.println("Please enter second students email: ");
        studentEmail = studentInput.nextLine();

        System.out.println("Please enter second students course: ");
        studentCourse = studentInput.nextLine();

        Student secondStudent = new Student(studentName);
        secondStudent.setEmailStudent(studentEmail);
        secondStudent.setCourseStudent(studentCourse);

        //get details of third student
        System.out.println("Please enter third students name: ");
        studentName = studentInput.nextLine();

        System.out.println("Please enter third students email: ");
        studentEmail = studentInput.nextLine();

        System.out.println("Please enter third students course: ");
        studentCourse = studentInput.nextLine();

        Student thirdStudent = new Student(studentName, studentEmail, studentCourse);

    }
}