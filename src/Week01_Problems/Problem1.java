package Week01_Problems;

/**________________ Problem _________________ <br>
 * Q. Given a 2D array of a fixed size decided beforehand <br>
 *  1. Randomize the elements at all indices of the array <br>
 *  2. Compute the sum of all these elements <br>
 *  3. Print that to the terminal <br>
 * ___________________________________________
 */
public class Problem1
{
    public static void main(String[] args)
    {
        // Initialise our 2-D array and give it a fixed size
        int[][] arr = new int[5][5];

        // Fill the array with random elements from 1 - 10
        for(int i =0; i<5; i++) // Iterates through the rows
        {
            for(int j = 0; j<5; j++) // Iterates through the columns
            {
                // Adds a random value between 1 and 10 to the index
                arr[i][j] = (int) ((Math.random()*10)+1);

                // Prints that value out to the terminal in a grid format so you can check the sum
                System.out.printf("[%d]",arr[i][j]);
            }
            System.out.println(); // Creates the next line for the row
        }

        System.out.printf("Sum = %d",sum(arr));
    }

    public static int sum(int[][] arr)
    {
        // Initialise our return variable
        int sum = 0;

        // Iterate through the array
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                sum += arr[i][j]; // Sum = the previous value of sum + the new index
            }
        }

        return sum;
    }
}
