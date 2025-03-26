package Week06_Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3
{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        String[] names = {"Fionn", "Ellie", "Michael", "Dave", "Eva", "Schrodinger", "Darragh", "Ben", "Amy", "Jack"};
        String customer13 = null;

        for (int i = 1; i <= 100; i++) {
            String customer = names[(int) (Math.random() * names.length)];

            if (i == 13) {
                customer13 = customer; // Store the 13th customer
            }

            if (i == 42 && customer13 != null) {
                System.out.println("Time paradox! Removing customer at position 42: " + customer);
                continue; // Remove the 42nd customer if they match the 13th
            }

            queue.add(customer);

            if (customer.equals("Dave") && (int) (Math.random() * 2) + 1 == 2) {
                System.out.println("Quantum cloning glitch! Duplicating Dave.");
                queue.add("Dave");
            }
        }

        System.out.println("\nServing customers:");
        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }
}
