public class StackTest {
    public static void main(String [] args){
        Stack myFirstStack = new Stack();
        Stack mySecondStack = new Stack();

        for(int x = 10; x<20; x++){
            myFirstStack.push(x);
            mySecondStack.push(x);
        }

        System.out.println("PRINTING STACKS");
        System.out.println("************************************");
        System.out.println("My First Stack");
        for(int x = 0; x<10; x++){
            System.out.println(myFirstStack.pop());
        }
        System.out.println();
        System.out.println("************************************");
        System.out.println("My Second Stack");
        for(int x = 0; x<10; x++){
            System.out.println(mySecondStack.pop());
        }
    }
}
