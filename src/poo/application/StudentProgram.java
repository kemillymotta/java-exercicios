package application;

import entities.Student;

import java.util.*;

public class StudentProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("RA: ");
        int ra = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Student stud = new Student(nome, ra);

        String curso;

        do {
            System.out.print("Qual o seu curso (SI/ADS)? ");
            curso = sc.nextLine().toUpperCase();

            switch (curso) {
                case "SI":
                    stud.setCurso(curso);
                    stud.setMonthlyFee(1000);
                    break;
                case "ADS":
                    stud.setCurso(curso);
                    stud.setMonthlyFee(1500);
                    break;
            }

            if (!curso.equals("SI") && !curso.equals("ADS")) {
                System.out.println("Curso inválido. Digite novamente.");
            }

        }while(!curso.equals("SI") && !curso.equals("ADS"));

        System.out.println();
        System.out.println(stud);
        System.out.println();

        int opcao = 0;

        do {
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Conferir mensalidade da faculdade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opções: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor a depositar: ");
                double valor = sc.nextDouble();
                stud.deposito(valor);
                System.out.println();
                System.out.println(stud);
                System.out.println();
            } else if (opcao == 2) {
                System.out.print("Valor a sacar: ");
                double valor = sc.nextDouble();
                stud.saque(valor);
                System.out.println();
                System.out.println(stud);
                System.out.println();
            } else if (opcao == 3) {
                System.out.println("Você já pagou a faculdade (S/N)? ");
                char resposta = sc.next().charAt(0);
                resposta = Character.toUpperCase(resposta);

                if (resposta == 'S') {
                    System.out.println("Nada a pagar.");
                    System.out.println();
                    System.out.println(stud);
                } else if (resposta == 'N') {
                    stud.monthlyFee();
                    System.out.println("Agora está pago :)");
                    System.out.println();
                    System.out.println(stud);
                }

            } else if (opcao == 4) {
                System.out.println("Fim do programa.");
            }

        } while (opcao != 4);

        sc.close();

    }
}