package Week13_Problems;

import java.util.*;

public class Problem1
{
    public static void main(String[] args)
    {
        // Our data to put into a new struct
        int[] data = new int[25];

        // Object instantiation
        FillD_Structs array = new FillD_Structs_2DArrays();
        FillD_Structs stack = new FillD_Structs_Stacks();
        FillD_Structs queue = new FillD_Structs_Queues();
        FillD_Structs hashMap = new FillD_Structs_HashMap();

        System.out.println("Please enter data to enter!");
        Scanner sc = new Scanner(System.in);
        for(int i  = 0 ; i< 25; i++){
            System.out.printf("Data[%d] = \n",i);
            int val = sc.nextInt();
            data[i] = val;
        }

        // Fill the data structures
        array.fillStruct(data);
        stack.fillStruct(data);
        queue.fillStruct(data);
        hashMap.fillStruct(data);

        // Print the data structures
        array.printStruct();
        stack.printStruct();
        queue.printStruct();
        hashMap.printStruct();


    }
}

class FillD_Structs{
    public FillD_Structs()
    {
        System.out.println("FillD Structs : Please specify a type of Data structure");
    }

    public void fillStruct(int[] data){}

    public void printStruct(){}

}

class FillD_Structs_2DArrays extends FillD_Structs
{
    private int[][] data;

    public FillD_Structs_2DArrays()
    {
        System.out.println("You can now try to fill a 2D array");
        data = new int[5][5];
    }

    @Override
    public void fillStruct(int[] data){
        int length = this.data.length;
        for(int i =0; i<length; i++)
        {
            for(int j = 0; j<length; j++){
                this.data[i][j] = data[(5*i) +j];
            }
        }
    }

    @Override
    public void printStruct()
    {
        System.out.println("Printing Data");
        for(int i = 0 ; i < data.length; i++){
            for(int j = 0 ; j < data[i].length; j++){
                System.out.printf(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class FillD_Structs_Stacks extends FillD_Structs
{
    private Stack<Integer> stack;

    public FillD_Structs_Stacks()
    {
        System.out.println("You can now try to fill a Stack");
        stack = new Stack<>();
    }

    @Override
    public void fillStruct(int[] data)
    {
        for(int i =0; i<data.length; i++)
        {
            stack.push(data[i]);
        }
    }

    @Override
    public void printStruct(){
        System.out.println("Printing Stack");
        while(!stack.isEmpty()){
            System.out.printf(stack.pop() + " ");
        }
        System.out.println();
    }

}

class FillD_Structs_Queues extends FillD_Structs{
    private Queue<Integer> queue;

    public FillD_Structs_Queues(){
        System.out.println("You can now try to fill a Queues");
        queue = new LinkedList<>();
    }

    public void fillStruct(int[] data){
        for(int i =0; i<data.length; i++){
            queue.add(data[i]);
        }
    }

    @Override
    public void printStruct(){
        System.out.println("Printing Queue");
        while(!queue.isEmpty())
        {
            System.out.printf(queue.poll() + " ");
        }
    }
}

class FillD_Structs_HashMap extends FillD_Structs
{
    private HashMap<Character, Integer> map;

    public FillD_Structs_HashMap()
    {
        map = new HashMap<>();
        System.out.println("You can now try to fill a HashMap");
    }

    @Override
    public void fillStruct(int[] data)
    {
        int asciiValue = 98;
        for(int i =0; i<data.length; i++){
            Character c = (char)asciiValue;
            map.put(c,data[i]);
            asciiValue++;
        }

    }

    @Override
    public void printStruct(){
        System.out.println("Printing HashMap");
        for(Character c : map.keySet())
        {
            System.out.printf(c +", " + map.get(c));
        }
        System.out.println();
    }
}