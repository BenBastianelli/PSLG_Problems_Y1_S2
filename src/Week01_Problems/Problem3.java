package Week01_Problems;

import java.util.Scanner;

/**________________ Problem _________________ <br>
 * Q. Write a java program that creates a pascal triangle after<br>
 *  taking scanner input after the following prompt:<br>
 * “Please enter the row length of our pascal triangle”<br>
 * ___________________________________________
 */
public class Problem3
{
    public static void main(String[] args)
    {
        // Initialise our scanner and read user input
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the row length of our pascal triangle : ");
        int row = in.nextInt();

        // Initialise our 2D-array;
        int[][] pascTriag = new int[row][row];

        // Iterate through and fill the triangle with the relevant data
        for(int i = 0; i< pascTriag.length; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                // Base case : Check if J = 0 OR i
                if(j == 0 || j == i)
                {
                    // assign the index a value of 1
                    pascTriag[i][j] = 1;
                }else{
                    // Otherwise it's the sum of the two adjacent terms above it
                    pascTriag[i][j] = pascTriag[i-1][j] + pascTriag[i-1][j-1];
                }
            }

        }

        // Print out array at the end
        System.out.printf("Your triangle for length %d \n",row);
        for(int i = 0; i<pascTriag.length; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(pascTriag[i][j] + " ");
            }
            System.out.println();
        }


    }

}
