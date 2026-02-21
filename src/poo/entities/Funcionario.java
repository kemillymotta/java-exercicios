package entities;

public class Funcionario {

    public String nome;
    public double salario;
    public int horasExtras;

    public double salarioFinal() {
        return salario + (horasExtras * 50);
    }

    public String toString() {
        return String.format("Nome do funcionario: %s%nSalário final: %.2f", nome, salarioFinal());
    }
}
