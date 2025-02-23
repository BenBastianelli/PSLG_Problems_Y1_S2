package Week01_Problems;
import java.util.Scanner;

/**________________ Problem _________________ <br>
 * Q. Create a program that converts a user given celsius temperature <br>
 *  To fahrenheit using the below formula <br>
 *
 *  Fahrenheit = ((celsius * 9/5) +32)
 * ___________________________________________
 */
public class Problem2
{
    public static void main(String[] args)
    {
        // Initialise our main variables
        int celsius;
        double fahrenheit;

        // Initialise a scanner that reads from Stdin (the terminal)
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a temperature in celsius
        System.out.println("Please enter a temperature in celsius! ❄\uFE0F");

        celsius = in.nextInt(); // Reads the next integer typed into the terminal

        fahrenheit = ((celsius * 9/5) + 32); // Apply formula

        System.out.printf("Fahrenheit = %.2f \n",fahrenheit); // Prints the temperature and formats it

    }
}
