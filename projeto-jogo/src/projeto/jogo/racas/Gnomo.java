/*@author Mariana*/
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class Gnomo implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int inteligenciaAtual = personagem.getInteligencia();
        int aumentoInteligencia = 2;
        personagem.setInteligencia(inteligenciaAtual + aumentoInteligencia);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
            + "+" + aumentoInteligencia + " de Inteligência\n");
    }

    public String toString() {
        return "Gnomo";
    }  
}