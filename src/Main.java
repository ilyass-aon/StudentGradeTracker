import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // the number of Students
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the students number " + (i + 1) + " : ");
            String name = sc.nextLine();

            System.out.println("Enter student grade: ");
            Double note = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name,note));




        }
        for ( Student s : students){
            System.out.println(s);
        }
        sc.close();

    }
}