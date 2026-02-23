    package revisao2002.application;

    import java.util.*;
    public class JogadoresProgram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); {

                System.out.println("----- CADASTRO DE JOGADORES -----");

                String nome[] = new String[5];
                int idade[] = new int[5];
                String posicao[] = new String[5];
                int gols[] = new int[5];


                int soma = 0;
                int maiorGols = 0;
                String artilheiro = "";

                for (int i = 0; i < 5; i++) {

                    System.out.printf("Jogador #%d%n", i + 1);

                    System.out.print("Nome: ");
                    nome[i] = sc.next();

                    System.out.print("Idade: ");
                    idade[i] = sc.nextInt();

                    System.out.print("Posição: ");
                    posicao[i] = sc.nextLine();
                    sc.next();

                    System.out.print("Gols: ");
                    gols[i] = sc.nextInt();

                    soma += idade[i];

                    if (gols[i] > maiorGols) {
                        maiorGols = gols[i];
                        artilheiro = nome[i];
                    }
                }

                double media = (double) soma / 5;

                System.out.println("Artilheiro: " + artilheiro);
                System.out.println("Média de idade: " + media);

                sc.close();
            }
        }
    }
