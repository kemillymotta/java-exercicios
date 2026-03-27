package herancaPolimorfismo.exercicios.musicalInstruments;

import java.util.*;

public class InstrumentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); {

            List<Instrument> list = new ArrayList<>();

            System.out.print("Enter number of intruments: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.print("Instrument #" + i + " - Stringed, Wind or Percussion (s/w/p)? ");
                char op = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Origin: ");
                String origin = sc.nextLine();
                System.out.print("Tuning: ");
                String tuning = sc.nextLine();

                    if(op == 's') {
                        System.out.print("Strings: ");
                        int strings = sc.nextInt();
                        System.out.print("Has frets (y/n)? ");
                        char frets = sc.next().charAt(0);

                        boolean hasFrets = (frets == 'y');

                        list.add(new Stringed(name, origin, tuning, strings, hasFrets));
                    } else if (op == 'w') {
                        System.out.print("Material: ");
                        String material = sc.nextLine();
                        System.out.print("Octaves: ");
                        int octaves = sc.nextInt();

                        list.add(new Wind(name, origin, tuning, material, octaves));
                    } else {
                        System.out.print("Pieces: ");
                        int pieces = sc.nextInt();
                        System.out.print("Has cymbals (y/n)? ");
                        char cymbals = sc.next().charAt(0);
                        boolean hasCymbals = (cymbals == 'y');
                        System.out.print("Max BPM: ");
                        int bpm = sc.nextInt();

                        list.add(new Percussion(name, origin, tuning, pieces, hasCymbals, bpm));
                    }
            }

            System.out.println();
            System.out.println("TECH SHEETS: ");
            for(Instrument inst : list) {
                System.out.println(inst.techSheet());
            }

            sc.close();
        }
    }
}
