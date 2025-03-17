public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        // Variables - This is a reusable container for a value
        /*
        Varibales can be divided into two types

        Primitive Variables
        - int - Whole Number
        - double - Decimal Number
        - char - single letter
        - boolean

        Reference Variables
        - string
        - array
        - object

        Creating a variables - Variables in Java can be created in two ways:-
        - declaration
        - Assignment
         */

        // INT
        int num; // Declaring a variable
        num = 21; // Assigning a value to a variable
        System.out.println("The initial number is " + num);

        int year = 2025;
        System.out.println("The year is " + year);

        //DOUBLE
        double price = 125.70;
        System.out.println("The price of a share is Ksh."+price);

        //CHAR
        char grade = 'A';
        System.out.println("My final grade is "+grade);

        //BOOLEAN
        boolean isStudent = false;
        System.out.println("Is John a student => "+ isStudent);

        //STRING
        String gitHandle = "ndolocr";
        System.out.println("My GIT handle is "+ gitHandle);
    }
}
