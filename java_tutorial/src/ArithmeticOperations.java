public class ArithmeticOperations {
    public static void main(String[] args){
        int x = 5;
        int y = 10;

        //Addition
        int sum = x+y;

        //Difference
        int difference = x-y;

        //Product
        int product = x*y;

        //Division
        int division = x/y;

        //Modulus
        int modulas = x%y;

        //Power
        int power = (int)Math.pow(x,y);

        System.out.println(x + " + " + y + " is: " + sum);
        System.out.println(x + " - " + y + " is: " + difference);
        System.out.println(x + " x " + y + " is: " + product);
        System.out.println(x + " / " + y + " is: " + division);
        System.out.println(x + " % " + y + " is: " + modulas);
        System.out.println(x + " raised to the power of " + y + " is: " + power);



    }
}
