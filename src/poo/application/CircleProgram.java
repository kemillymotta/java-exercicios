package application;

import entities.Circle;

import java.util.*;

public class CircleProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.println("Radius:");
        circle.radius = sc.nextDouble();
        System.out.println();
        System.out.println(circle);

        sc.close();
    }
}
