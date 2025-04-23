package Week08_Problems;

import java.util.*;

public class Problem3
{
    public static void addSubjects(List<String> subjects){
        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Irish");
        subjects.add("Physics");
        subjects.add("Chemistry");
    }

    public static void loadHashMap(String[] students, List<String> subjects, HashMap<String,List<String>> records)
    {
        for(String student : students){
            int numberOfSubjects = (int) (Math.random()*subjects.size());
            if(numberOfSubjects == subjects.size())
            {
                records.put(student,subjects);
                break;
            }

            List<String> studentSubjects = new ArrayList<>();
            for(int i = 0; i<numberOfSubjects; i++)
            {
                String subject = subjects.get(i);
                studentSubjects.add(subject);
            }
            records.put(student,studentSubjects);
        }

    }

    public static void search(List<String> studentSubjects,HashMap<String,List<String>> records,String subject)
    {
        Set<String> set = records.keySet();

        for(String student : set)
        {
            int size = records.get(student).size();
            List<String> studSubjects = records.get(student);
            for(int i =0; i<size;i++)
            {
                if(studSubjects.get(i).equals(subject))
                {
                    studentSubjects.add(student);
                    break;
                }

            }
        }

    }

    public static void main(String[] args)
    {
        // Subjects
        List<String> subjects = new ArrayList<String>();
        addSubjects(subjects);

        // HashMap to store all records of students -> Subjects
        HashMap<String, List<String>>  records = new HashMap<>();

        // Add students
        String[] students = {"Sean","Amy","Fionn","Patrick","Ben"};
        loadHashMap(students,subjects,records);

        // Choose a random subject to search for
        String chosenSubject = subjects.get((int)(Math.random()*subjects.size()));
        System.out.println("Chosen Subject : " + chosenSubject);

        // Search for each student that has that subject
        List<String> studentSubjects = new ArrayList<>();
        search(studentSubjects,records,chosenSubject);

        // Print out the result
        int count = 1;
        for(String student : studentSubjects)
        {
            System.out.printf("Student %d : %s\n",count,student);
            count++;
        }

    }
}
