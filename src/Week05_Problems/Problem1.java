package Week05_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1
{
    // Method for adding Lectures
    public static void add(ArrayList<String> arr, Scanner in)
    {
        System.out.println("Please type a module name to be added : ");
        arr.add(in.nextLine());
    }

    // Method for displaying lectures
    public static void display(ArrayList<String> arr)
    {
        for(int i = 0; i<arr.size();i++)
            System.out.printf("Lecture %d : %s \n",i+1,arr.get(i));
    }

    // Main Driver
    public static void main(String[] args)
    {
        // Initialise the array list & scanner
        ArrayList<String> arr = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        boolean running = true;
        while(running)
        {
            System.out.println("Please select an option :" +
                               "\nA)dd" +
                               "\nD)isplay" +
                               "\nQ)uit");
            String choice = in.nextLine().toUpperCase();

            switch(choice)
            {
                case "A" -> add(arr,in);
                case "D" -> display(arr);
                case "Q" -> running = false;
                default -> System.out.println("Error! Incorrect input type please only type the first letter of your choice");

            }
        }
    }

}
