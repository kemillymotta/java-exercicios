package herancaPolimorfismo.exercicios.spaceMissions;

import java.util.*;

public class SpaceMissionProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<SpaceMission> list = new ArrayList<>();

            System.out.print("Enter number of missions: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.print("Mission #" + i + " - Crewed, Robotic or Probe (c/r/p)? ");
                char op = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Mission name: ");
                String missionName = sc.nextLine();
                System.out.print("Launch year: ");
                int year = sc.nextInt();

                    if(op == 'c') {
                        System.out.print("Crew size: ");
                        int crewSize = sc.nextInt();
                        System.out.print("Days in space: ");
                        int daysInSpace = sc.nextInt();

                        list.add(new CrewedMission(missionName, year, crewSize, daysInSpace));
                    } else if (op == 'r') {
                        System.out.print("Rover name: ");
                        String roverName = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Operating years: ");
                        int operatingYears = sc.nextInt();

                        list.add(new RoboticMission(missionName, year, roverName, operatingYears));
                    } else {
                        System.out.print("Destination: ");
                        String destination = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Travel years: ");
                        int travelYears = sc.nextInt();

                        list.add(new ProbeMission(missionName, year, destination, travelYears));
                    }
            }

            System.out.println();
            System.out.println("MISSION REPORTS:");
            for(SpaceMission space : list) {
                System.out.println(space.missionReport());
            }


            sc.close();
        }
    }
}
