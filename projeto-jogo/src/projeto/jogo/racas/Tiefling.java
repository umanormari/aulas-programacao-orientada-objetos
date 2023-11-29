/*@author Mariana*/
package projeto.jogo.racas;

import projeto.jogo.Raca;
import projeto.jogo.Personagem;

public class Tiefling implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int inteligenciaAtual = personagem.getInteligencia();
        int aumentoInteligencia = 1;
        personagem.setInteligencia(inteligenciaAtual + aumentoInteligencia);

        int carismaAtual = personagem.getCarisma();
        int aumentoCarisma = 2;
        personagem.setCarisma(carismaAtual + aumentoCarisma);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
        + "+" + aumentoInteligencia + " de Inteligência\n"
        + " + " + aumentoCarisma + " de Carisma\n");
    }
    
    public String toString() {
        return "Tiefling";
    }
}