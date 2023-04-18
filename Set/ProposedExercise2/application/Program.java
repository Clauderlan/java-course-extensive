package exercicios.Set.ProposedExercise2.application;

import exercicios.Set.ProposedExercise2.entities.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> studentsCourseA = new HashSet<>();
        Set<Student> studentsCourseB = new HashSet<>();
        Set<Student> studentsCourseC = new HashSet<>();

        System.out.println("How many students for course A ?");

        int studentsA = scanner.nextInt();
        for(int x = 0; x < studentsA; x++){
            System.out.println("Student code and name :");
            String studentName = scanner.next();
            int studentCode = scanner.nextInt();

            studentsCourseA.add(new Student(studentName, studentCode));

        }

        System.out.println("How many students for course B ?");
        int studentsB = scanner.nextInt();
        for(int x = 0; x < studentsB; x++){
            System.out.println("Student code and name :");
            String studentName = scanner.next();
            int studentCode = scanner.nextInt();

            studentsCourseB.add(new Student(studentName, studentCode));

        }

        System.out.println("How many students for course C ?");
        int studentsC = scanner.nextInt();
        for(int x = 0; x < studentsC; x++){
            System.out.println("Student code and name :");
            String studentName = scanner.next();
            int studentCode = scanner.nextInt();

            studentsCourseC.add(new Student(studentName, studentCode));

        }

        Set<Student> studentsTotal = new HashSet<>(studentsCourseA);
        studentsTotal.addAll(studentsCourseB);
        studentsTotal.addAll(studentsCourseC);
        System.out.println("Total students: " + studentsTotal.size());
    }
}
