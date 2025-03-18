import java.util.Scanner;
public class subStringMethod {
    public  static  void main(String args []){
        // substring() -> This is a method used to extract a portion of a sting
        // .substring(start, end)

        String email = "ndolocr@gmail.com";
        String domain = email.substring(8, 17);
        String username = email.substring(0, 7);

        System.out.println("Domain -> " + domain);
        System.out.println("Username -> " + username);

        String newEmail = email.substring(0, email.indexOf("@"));
        System.out.println("New Username -> " + newEmail);

        String newDomain = email.substring(email.indexOf("@")+1);
        System.out.println("New Domain -> " + newDomain);
    }
}
