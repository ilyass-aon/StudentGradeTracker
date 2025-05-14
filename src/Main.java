import java.util.ArrayList;
import java.util.Collections;
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
        // Calcul et affichage
        double average = Student.Calculermoy(students);
        String minGrade = Student.findMinGrade(students);
        String maxGrade = Student.findMaxGrade(students);

        System.out.println("\nStatistiques des notes :");
        System.out.println("Moyenne générale : " + average);
        System.out.println("l'étudiant avec la note minimale : " + minGrade);
        System.out.println("l'étudiant avec la note maximale : " + maxGrade);

        Collections.sort(students);
        System.out.println(" Liste des étudiants triée par note décroissante :");
        for (Student s : students){
            System.out.println(s);
        }
        sc.close();

    }
}