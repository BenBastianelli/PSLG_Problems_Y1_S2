import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public static String reverseString(String str){
        //stack to store chars
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();

        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse: ");
        String input = in.nextLine();

        //string to hold reversed string
        String output = reverseString(input);

        System.out.println("Reversed String: " + output);

        in.close();
    }
}
