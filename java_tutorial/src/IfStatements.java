public class IfStatements {
    public static void  main(String [] args){
        int age = 25;

        if(age >= 18){
            System.out.println("You are an adult");
        }else if(age<0){
            System.out.println("You are not born yet");
        }else if (age==0){
            System.out.println("You are an infant");
        }
        else{
            System.out.println("You are a child");
        }
    }
}
