package Week08_Problems;

import java.util.Arrays;
import java.util.HashSet;

public class Problem2
{
    public static void randomise(int n,int[] arr)
    {
        int length = arr.length;

        for(int i=0;i<length;i++)
        {
            arr[i] = (int)(Math.random()*n +1);
        }

    }
    public static void main(String[] args)
    {
        // Setting up the array
        int[] arr = new int[10];
        randomise(5,arr);
        System.out.println("Array after randomisation:" + Arrays.toString(arr));
        // Setting up our hashSet
        HashSet<Integer> set = new HashSet<Integer>();

        // variable to print out our result;
        int duplicate = -1; // Assume initially theres no duplicates

        // Add the first element before looping
        set.add(arr[0]);
        for(int i = 1; i< arr.length; i++)
        {
            if(set.contains(arr[i]))
            {
                duplicate = arr[i];
                break;
            }
            else
            {
                set.add(arr[i]);
            }
        }

        System.out.println("Duplicate is : "+duplicate);

    }
}
