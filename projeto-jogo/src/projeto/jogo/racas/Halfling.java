/*@author Mariana */
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class Halfling implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int destrezaAtual = personagem.getDestreza();
        int aumentoDestreza = 2;
        personagem.setDestreza(destrezaAtual + aumentoDestreza);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
            + "+" + aumentoDestreza + " de Destreza\n");
    }
    
    public String toString() {
        return "Halfling";
    }
}