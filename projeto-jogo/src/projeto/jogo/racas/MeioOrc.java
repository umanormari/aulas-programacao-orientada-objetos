/*@author Mariana*/
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class MeioOrc implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int forcaAtual = personagem.getForca();
        int aumentoForca = 2;
        personagem.setForca(forcaAtual + aumentoForca);
        
        
        int constituicaoAtual = personagem.getConstituicao();
        int aumentoConstituicao = 1;
        personagem.setConstituicao(constituicaoAtual + aumentoConstituicao);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
            + "+" + aumentoForca + " de Força\n"
            + "+" + aumentoConstituicao + " de Constituição\n");
    }


    public String toString() {
        return "MeioOrc";
    }
}