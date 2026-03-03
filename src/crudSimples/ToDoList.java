package crudSimples;

import java.util.*;
public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            List<Task> tasks = new ArrayList<>();

            int option = 0;

            while(option != 6) {
                menu();
            }
            sc.close();
        }
    }

        public static void menu() {
            Scanner sc = new Scanner(System.in);
            System.out.println("==== TO DO LIST ====");
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Update task");
            System.out.println("4 - Delete task");
            System.out.println("5 - Mark task as done");
            System.out.println("6 - Exit");
            int option = sc.nextInt();

    }
}
