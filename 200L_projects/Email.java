import java.util.Scanner;

public class Email
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String email, username, domain;

        //prompt user for email
        System.out.print("Enter your email: ");
        email = input.nextLine();

        int lastIndex = email.length(); //last character index
        int atIndex = email.indexOf('@'); //@ character index

        //breaks a given email address into username and domain name
        username = email.substring(0, atIndex);
        domain = email.substring(atIndex + 1, lastIndex);

        System.out.println("The username is: " + username);
        System.out.println("the domain name is: " + domain);
    }    
}