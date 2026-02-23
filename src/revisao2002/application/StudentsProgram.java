package revisao2002.application;
import java.util.*;

import revisao2002.entities.Students;

public class StudentsProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Students> list = new ArrayList<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Student #%d:%n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            list.add(new Students(name, grade));
        }

        System.out.print("Enter the name you want to search: ");
        String searchName = sc.nextLine();

        Students result = list.stream()
                .filter(x -> x.getName().equalsIgnoreCase(searchName))
                .findFirst()
                .orElse(null);

        if (result != null) {
            System.out.println("Student found");
            System.out.println("Grade: " + result.getGrade());
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}