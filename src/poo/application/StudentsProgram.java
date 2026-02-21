package application;

import entities.Students;

import java.util.*;

public class StudentsProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students stud = new Students();
        System.out.println("Student name");
        stud.name = sc.nextLine();
        System.out.println();
        System.out.println("Put the student's 3 grades: ");
        stud.grade1 = sc.nextDouble();
        stud.grade2 = sc.nextDouble();
        stud.grade3 = sc.nextDouble();
        System.out.println();

        System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());

        if(stud.pass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", stud.missingPoints());
        }




        sc.close();
    }
}
