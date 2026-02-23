package revisao2002.application;

import java.util.*;
import revisao2002.entities.Movies;

public class MoviesProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

            List<Movies> list = new ArrayList<>();

            System.out.println("How many movies?");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < n; i++) {
                System.out.print("Movie name: ");
                String movie = sc.nextLine();
                System.out.print("Movie duration: ");
                int duration = sc.nextInt();
                sc.nextLine();

                list.add(new Movies (movie, duration));
            }

            System.out.print("Search: ");
            String searchMovie = sc.nextLine();
            Movies result = list.stream()
                            .filter(x -> x.getMovie().equalsIgnoreCase(searchMovie))
                            .findFirst()
                            .orElse(null);

            if(result != null) {
                System.out.println("MOVIE FOUND!");
                System.out.printf("Duration: %d minutes", result.getDuration());
            } else {
                System.out.println("MOVIE NOT FOUND.");
            }

            sc.close();
        }
    }
}
