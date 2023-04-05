import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //prompt user for sides of triangle
        System.out.print("Enter values for side a, b, and c: ");
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        //compute perimeter for the triangle
        double perimeter = a + b + c;

        //compute area for the triangle
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //compute longest side for the triangle
        double longest = Math.max(a, Math.max(b, c));

        //compute smallest side for the triangle
        double smallest = Math.min(a, Math.min(b, c));

        //compute remainder
        double remainder = longest % smallest;

        //print result
        System.out.printf("The perimter of triangle is% .2f", perimeter);
        System.out.println();
        System.out.print("The area of triangle with sides a=" + a + ", b=" + b + ", c=" + c);
        System.out.printf(" is% .2f", area);
        System.out.println("unit square");
        System.out.println("The longest side is " + longest);
        System.out.println("The smallest side is " + smallest);
        System.out.println("The remainder is " + remainder);
    }   
}