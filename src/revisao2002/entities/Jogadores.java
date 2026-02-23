package revisao2002.entities;

public class Jogadores {

    private String nome;
    private int idade;
    private String posicao;
    private int gols;

    public Jogadores(String nome, int idade, String posicao, int gols) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.gols = gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
}
