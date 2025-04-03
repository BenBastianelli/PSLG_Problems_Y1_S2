package Week06_Problems;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();
        String[] names = {"Fionn","Ellie","Michael","Dave"};

        String customer13 = null;

        for(int i = 1; i<=100; i++)
        {
            String customer = names[(int)(Math.random()*names.length)];
            if(i == 13) customer13 = customer;

            if(i == 42 && customer13 != null){
                System.out.println("Time paradox ! Removing customer at position 42 : " + customer);
                queue.remove(customer);
                continue;
            }
            queue.add(customer);
            if(customer.equals("Dave") && (int) (Math.random()*2) +1 ==2){
                System.out.println("Quantum Cloning glitch! Duplicating Dave");
                queue.add("Dave");
            }

        }

        System.out.println("\n Serving Customers");
        while(!queue.isEmpty()){
            System.out.println("Serving :" + queue.poll());
        }
    }
}
