/* @author Mariana */
package projeto.jogo.classes;

import projeto.jogo.Classe;
import projeto.jogo.Personagem;

public class Barbaro implements Classe {
    @Override
    public void aplicarBonusProeficiencia(Personagem personagem){
        System.out.println("Aplicando bônus de proficiência da classe: " + this.getClass().getSimpleName() + "\n");
    }
}

/*
CARACTERÍSTICAS DE CLASSE

PONTOS DE VIDA
Dado de Vida: 1d12 por nível de bárbaro 
Pontos de Vida no 1° Nível: 12 + seu modificador de Constituição 
Pontos de Vida nos Níveis Seguintes: 1d12 (ou 7) + seu modificador de Constituição por nível de bárbaro após o 1° 

PROFICIÊNCIAS
Armaduras: Armaduras leves, armaduras médias e escudos 
Armas: Armas simples, armas marciais 
Ferramentas: Nenhuma 
Testes de Resistência: Força, Constituição 
Perícias: Escolha duas dentre Adestrar Animais, 
Atletismo, Intimidação, Natureza, Percepção e Sobrevivência 
*/