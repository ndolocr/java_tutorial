import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("What is your GPA; ");
        double gpa = input.nextDouble();

        System.out.println("Are you a student (true/false) ");
        boolean isStudent = input.nextBoolean();

        System.out.println("My name is "+name);
        System.out.println("Your age is "+age+" years.");
        System.out.println("Your GPA is "+gpa+".");
        System.out.println("Student "+isStudent+".");
        input.close();
    }

}
