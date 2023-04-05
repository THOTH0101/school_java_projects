import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //create a scanner object

        //generate a random
        Random rand = new Random();
        int randomInt = rand.nextInt(1000);

        //prompt user for the following details
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your middle name: ");
        String middleName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //form a password
        System.out.println("Your passsword is: " + firstName.charAt(0) +
        middleName.charAt(0) + lastName.charAt(0) + randomInt * age);
    }    
}