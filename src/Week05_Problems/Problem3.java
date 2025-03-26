package Week05_Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (enqueue X / dequeue / display / exit): ");
            String command = scanner.nextLine();

            if (command.startsWith("enqueue")) {
                String name = command.split(" ")[1];
                queue.offer(name);
                System.out.println(name + " has taken a ticket.");
            } else if (command.equals("dequeue")) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.poll() + " has been served.");
                } else {
                    System.out.println("No customers in the queue.");
                }
            } else if (command.equals("display")) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue: " + queue);
                }
            } else if (command.equals("exit")) {
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }

        scanner.close();
    }
}

