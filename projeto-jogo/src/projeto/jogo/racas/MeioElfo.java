/*@author Mariana*/
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class MeioElfo implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int carismaAtual = personagem.getCarisma();
        int aumentoCarisma = 2;
        personagem.setCarisma(carismaAtual + aumentoCarisma);
        
        int destrezaAtual = personagem.getDestreza();
        int aumentoDestreza = 1;
        personagem.setDestreza(destrezaAtual + aumentoDestreza);
        
        int inteligenciaAtual = personagem.getInteligencia();
        int aumentoInteligencia = 1;
        personagem.setInteligencia(inteligenciaAtual + aumentoInteligencia);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
            + "+" + aumentoDestreza + " de Destreza\n"
            + "+" + aumentoInteligencia + " de Inteligência\n"
            + " + " + aumentoCarisma + " de Carisma\n");
    }


    
    public String toString() {
        return "MeioElfo";
    }
}