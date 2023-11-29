/*@author Mariana */
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class Draconato implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int forcaAtual = personagem.getForca();
        int aumentoForca = 2;
        personagem.setForca(forcaAtual + aumentoForca);

        int carismaAtual = personagem.getCarisma();
        int aumentoCarisma = 1;
        
        personagem.setCarisma(carismaAtual + aumentoCarisma);
        
        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
            + " + " + aumentoForca + " de Força\n"
            + " + " + aumentoCarisma + " de Carisma\n");
    }
    
    public String toString() {
        return "Draconato";
    }
}