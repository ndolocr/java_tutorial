import java.util.Scanner;

public class MadLibs {
    public static void main(String [] args){
        String noun1;
        String verb1;
        String adjective1;
        String adjective2;
        String adjective3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an adjective (description)");
        adjective1 = input.nextLine();
        System.out.print("Enter a noun (animal or person)");
        noun1 = input.nextLine();
        System.out.print("Enter an adjective (description)");
        adjective2 = input.nextLine();
        System.out.print("Enter a verb ending with -ing (action)");
        verb1 = input.nextLine();
        System.out.print("Enter an adjective (description)");
        adjective3 = input.nextLine();

        System.out.println("\nToday, I went to a "+ adjective1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and "+ verb1 + "!");
        System.out.println("I was " + adjective3 + ".");

        input.close();
    }
}
