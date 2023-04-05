public class NestedForLoop
{
    public static void main(String[] args)
    {
        int integer[][] = {{20, 13, 6}, {61, 45, 70}, {3, 5, 9}}; //initialize a 2D array

        //print out the array
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                System.out.printf("%3d", integer[i][j]);
            System.out.println();
        }

    }
}
