public class Assignment01
{
    public static void main(String[] args)
    {
        //the a part
        double miles = 10.5;
        miles++;
        System.out.println("The current value of miles is now: " + miles);

        //the b part
        double x, y, z;
        int a = 1;
        double d = 1.0;
        x = d + 43 % 5 * (23 * 3 % 2);
        y = 1.5 * 3 + (++a);
        z = 3 + d * d + 4;
        System.out.println("The value of x is : " + x + "\nThe value of y is : " + y + "\nThe value of z is : " + z);

        //the c part
        double r, p;
        p = 3.758;
        r = Math.log(p);
        System.out.println("The of r is : " + r);
    }
}