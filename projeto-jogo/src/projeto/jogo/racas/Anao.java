/*@author Mariana */
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class Anao implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int constituicaoAtual = personagem.getConstituicao();
        int aumentoConstituicao = 2;
        personagem.setConstituicao(constituicaoAtual + aumentoConstituicao);
        
        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
                + "+" + aumentoConstituicao + " de Constituição\n");
    }
    
    public String toString() {
        return "Anão";
    }
}


