package revisao2002;

import java.util.*;

public class CofrinhoInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {


            int deposito = 0, soma = 0, contador = 0, maior = 0;

            do {
                deposito = sc.nextInt();

                if (deposito != 0) {
                    soma += deposito;
                    contador++;

                    if (deposito > maior) {
                        maior = deposito;
                    }
                }

            }while(deposito != 0);

            System.out.printf("Total guardado: %d%n", soma);
            System.out.printf("Depositos: %d%n", contador);
            System.out.printf("Maior deposito: %d", maior);

            sc.close();
        }
    }

}
