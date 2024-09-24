import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //num LEGAL_AGE = 21
        //num userAge = 0
        Scanner in = new Scanner(System.in);
        final int LEGAL_AGE = 21;
        int userAge = 0;
        String trash = "";

        //output “Enter your age: ”

        System.out.println("Enter your age: ");

        //input userAge

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

        //if userAge >= LEGAL_AGE then
        //output “Congratulations! You get a wristband.”
        //endIf

        if (userAge >= LEGAL_AGE)
        {
            System.out.println("Congratulations! You get a wristband.");
        }
    }
}