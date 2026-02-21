package application;

import entities.Funcionario;

import java.util.*;

public class FuncionarioProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.println("Nome do funcionario:");
        func.nome = sc.nextLine();
        System.out.println("Salário:");
        func.salario = sc.nextDouble();
        System.out.println("Horas extras trabalhadas:");
        func.horasExtras = sc.nextInt();
        System.out.println();
        System.out.println(func);


        sc.close();

    }
}
