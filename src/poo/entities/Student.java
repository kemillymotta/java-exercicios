package entities;

public class Student {

    private String nome;
    private int ra;
    private String curso;
    private double monthlyFee;
    private double saldo;


    public Student(String nome, int ra, String curso, double monthlyFee, double saldo) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.saldo = saldo;
        this.monthlyFee = monthlyFee;
    }

    public Student(String nome, int ra) {
        this.ra = ra;
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double valor) {
       saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 2;
    }

    public void monthlyFee() {
        saldo -= monthlyFee;
    }

    public String toString() {
        return "Aluno: "
                + nome
                + ", RA: "
                + ra
                + ", Saldo: "
                + saldo
                + ", Curso: "
                + curso
                + ", Mensalidade: "
                + monthlyFee;
    }
}
