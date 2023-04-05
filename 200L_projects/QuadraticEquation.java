import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //craete scanner input

        double a, b, c; //initialise variable a, b, c

        //prompt user for values of a, b, and c
        System.out.print("Enter values for a, b, and c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double discriminant = (b * b) - (4 * a * c); //compute discriminant

        //compute roots of the quadratic equation
        double root1 = ((-b) + Math.sqrt(b * b  - 4 * a * c)) / (2 * a);
        double root2 = ((-b) - Math.sqrt(b * b  - 4 * a * c)) / (2 * a);

        //display result base on conditions
        if(discriminant < 0)
        System.out.println("The equation has no real roots");

        else if(discriminant == 0)
        System.out.println("The root of the equation is " + root1);

        else
        System.out.println("The roots of the equation are " + root1 + " and " + root2);

    }
    
}