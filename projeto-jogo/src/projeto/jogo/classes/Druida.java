/* @author Mariana */
package projeto.jogo.classes;

import projeto.jogo.Classe;
import projeto.jogo.Personagem;

public class Druida implements Classe {
     @Override
    public void aplicarBonusProeficiencia(Personagem personagem){
        System.out.println("Aplicando bônus de proficiência da classe: " + this.getClass().getSimpleName() + "\n");
    }
}
