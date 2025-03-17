import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String args []){
        int years;
        double rate;
        double amount;
        double principal;
        int timeCompounded;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest Rate : ");
        rate = scanner.nextDouble() /100;

        System.out.print("Enter  the number of times Compounded per year : ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter  the number of years : ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.println("The amount after " + years + " is Ksh. " + amount);


        scanner.close();
    }
}
