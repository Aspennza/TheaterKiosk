import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int LEGAL_AGE = 21;
        int userAge = 0;
        String trash = "";


        System.out.print("Enter your age: ");


        if (in.hasNextInt())
        {
            userAge = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nPlease enter an integer value. You entered: " + trash + ".");
            System.out.println("\nPlease run the program again.");
            System.exit(0);
        }


        if (userAge >= LEGAL_AGE)
        {
            System.out.println("\nCongratulations! You get a wristband.");
        }
    }
}