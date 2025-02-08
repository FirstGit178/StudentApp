import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        getDetails();
        getDetails1();
        getDetails2();
        getDetails3();
    }
    public static String[] getDetails()
    {

        Scanner sc = new Scanner(System.in);
        //prompting for details for products
        String[] details = new String[3];
        System.out.println("Please enter name");
        String name = sc.nextLine();
        System.out.println("Please enter email");
        String email = sc.nextLine();
        System.out.println("Please enter course");
        String course = sc.nextLine();
        return details;
    }
}