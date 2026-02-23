package revisao2002;
import java.util.*;

public class Ranking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pontuacao[] = new int[8];
        String nome[] = new String[8];

        int campeao = 0, ultimoLugar = 0;

        for(int i = 0; i < 8; i++) {

            System.out.printf("Jogador %d: ", i+1);
            nome[i] = sc.nextLine();

            System.out.printf("Pontuação jogador %d: ", i+1);
            pontuacao[i] = sc.nextInt();
            sc.nextLine();

            if (pontuacao[i] > pontuacao[campeao]) {
                campeao = i;
            }

            if (pontuacao[i] < pontuacao[ultimoLugar]) {
                ultimoLugar = i;
            }
        }

        System.out.printf("1 - %s (%d pontos)%n", nome[campeao], pontuacao[campeao]);
        System.out.printf("8 - %s (%d pontos)", nome[ultimoLugar], pontuacao[ultimoLugar]);

        sc.close();
    }
}