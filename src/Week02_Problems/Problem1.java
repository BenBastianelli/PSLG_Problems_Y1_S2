package Week02_Problems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your grades for this semester: ");
        System.out.println("Grade 1: ");
        double grade1 = userInput.nextDouble();

        System.out.println("Grade 2: ");
        double grade2 = userInput.nextDouble();

        System.out.println("Grade 3: ");
        double grade3 = userInput.nextDouble();

        System.out.println("Grade 4: ");
        double grade4 = userInput.nextDouble();

        System.out.println("Grade 5: ");
        double grade5 = userInput.nextDouble();

        double totalMarks = grade1 + grade2 + grade3 + grade4 + grade5;
        double avgMarks = totalMarks / 5;

        String letterGrade;
        if(avgMarks >= 90){
            letterGrade ="A";
        }else if (avgMarks <= 89 && avgMarks >= 75) {
            letterGrade = "B";
        }else if (avgMarks <= 74 && avgMarks >= 55) {
            letterGrade = "C";
        }else if (avgMarks <= 54 && avgMarks >= 40) {
            letterGrade = "D";
        }else if(avgMarks <= 39 && avgMarks >= 20){
            letterGrade = "E";
        }else{
            letterGrade = "F";
        }

        System.out.println("Total marks are: " + totalMarks);
        System.out.println("Average marking is: " + avgMarks);
        System.out.println("Letter grade is: " + letterGrade);
    }
}
