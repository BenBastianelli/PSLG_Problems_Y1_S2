import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void addGrade(ArrayList<Integer> grades, Scanner in) {
        System.out.println("Enter Grade : ");
        int grade = in.nextInt();

        if(grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade Added Successfully!");
        }else{
            System.out.println("Grade Not Added Successfully :(");
        }
    }

    public static void removeGrade(ArrayList<Integer> grades, Scanner in) {
        System.out.println("Enter Grade To Remove : ");
        int grade = in.nextInt();

        if(grades.contains(grade)) {
            grades.remove(Integer.valueOf(grade));
            System.out.println("Grade Removed Successfully!");
        }else{
            System.out.println("Grade Not Removed Successfully :(");
        }
    }

    public static void calculateAverage(ArrayList<Integer> grades) {
        if(grades.isEmpty()){
            System.out.println("No Grades Found");
            return;
        }
        int sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.size();
        System.out.printf("Average Grade is %.2f\n", average);;
    }

    public static void displayGrades(ArrayList<Integer> grades) {
        if(grades.isEmpty()){
            System.out.println("No Grades Found");
            return;
        }
        System.out.println("Grades :" + grades);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        boolean running = true;

        while(running) {
            System.out.println("\nStudent Grade Manager");
            System.out.println("1. Add Grade");
            System.out.println("2. Remove Grade");
            System.out.println("3. Calculate Average");
            System.out.println("4. Display Grades");
            System.out.println("5. Exit");

            int choice = in.nextInt();

            switch(choice) {
                case 1:
                    addGrade(grades, in);
                    break;
                case 2:
                    removeGrade(grades, in);
                    break;
                case 3:
                    calculateAverage(grades);
                    break;
                case 4:
                    displayGrades(grades);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
