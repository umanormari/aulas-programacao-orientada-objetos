package com.mycompany.batalha;
import java.util.Scanner;
import java.util.Random;

public class Personagem {
    int ataque;
    int defesa;
    int vida = 20;
    int pontosAtributo = 15;

    public void iniciarBatalha() {
        int rodadas = 0;
        boolean continuar = true;
        Random random = new Random();

        Scanner lerTeclado = new Scanner(System.in);

        while (continuar && rodadas < 15) {
            System.out.println("Rodada " + (rodadas + 1));
            System.out.println("Escolha uma opção:");
            System.out.println("(1) - Sair");
            System.out.println("(2) - Ataque");
            System.out.println("(3) - Defesa");

            int opcao = lerTeclado.nextInt();

            switch (opcao) {
                case 1:
                    continuar = false;
                    break;
                case 2:
                    System.out.println("Você escolheu atacar");
                    System.out.println("Escolha um valor:");
                    int valor = lerTeclado.nextInt();
                    if (valor < vida) {
                        ataque += valor;
                        vida -= ataque;
                        System.out.println("Você atacou com: " + ataque + " pontos. O inimigo ainda tem: " + vida + " pontos de vida.\n");
                        pontosAtributo++;
                    } else {
                        System.out.println("Valor inválido. A vida do inimigo é maior ou igual ao valor de ataque.");
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu se defender");
                    // Adicione aqui a lógica de defesa, se necessário.
                    break;
                    default:
                    System.out.println("Opção inválida. Digite (1) para sair, (2) para atacar, ou (3) para defender.");
                    break;
            }
            
            int acaoOponente = random.nextInt(2) + 2; // 2 para atacar, 3 para defender

            if (acaoOponente == 2) {
                int valorOponente = random.nextInt(vida);
                ataque += valorOponente;
                vida -= ataque;
                System.out.println("O oponente atacou com: " + ataque + " pontos. Você ainda tem: " + vida + " pontos de vida.\n");
            } else {
                System.out.println("O oponente escolheu se defender");
                // Adicione a lógica de defesa do oponente, se necessário.
            }

            rodadas++;
        }

        if (rodadas >= 15) {
            System.out.println("A batalha terminou após 15 rodadas.");
        } else if (vida <= 0) {
            System.out.println("Você venceu a batalha!");
        } else {
            System.out.println("O oponente venceu a batalha.");
        }
    }
}