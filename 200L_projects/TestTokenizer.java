import java.util.*;

public class TestTokenizer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //create scanner object

        //prompt for user input
        System.out.print("Enter a sentence: ");
        String inputLine = input.nextLine();

        StringTokenizer tokens = new StringTokenizer(inputLine, ".,;?"); //create a tokenizer object
        
        //print result
        while(tokens.hasMoreTokens())
            System.out.println(tokens.nextToken());
    }
}
