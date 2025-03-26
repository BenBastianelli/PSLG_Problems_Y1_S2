package Week05_Problems;

import java.util.Stack;
import java.util.Scanner;

public class Problem2
{
    // Method to do coin comparison
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();

        // Push the first half of the string onto the stack
        for (int i = 0; i < length / 2; i++) {
            stack.push(s.charAt(i));
        }

        // Determine the starting index for comparison
        int startIndex = 0;
        if(length % 2 == 0 )
        {
            startIndex = length/2;
        }else{
            startIndex = length/2 + 1;
        }

        // Compare the second half with the stack
        for (int i = startIndex; i < length; i++) {
            if (stack.pop() != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a word :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (isPalindrome(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
