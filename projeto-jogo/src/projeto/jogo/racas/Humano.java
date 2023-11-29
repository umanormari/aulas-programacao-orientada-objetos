/*@author Mariana */
package projeto.jogo.racas;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;

public class Humano implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        int forcaAtual = personagem.getForca();
        int aumentoForca = 1;
        personagem.setForca(forcaAtual + aumentoForca);

        int destrezaAtual = personagem.getDestreza();
        int aumentoDestreza = 1;
        personagem.setDestreza(destrezaAtual + aumentoDestreza);
        
        int constituicaoAtual = personagem.getConstituicao();
        int aumentoConstituicao = 1;
        personagem.setConstituicao(constituicaoAtual + aumentoConstituicao);
        
        int inteligenciaAtual = personagem.getInteligencia();
        int aumentoInteligencia = 1;
        personagem.setInteligencia(inteligenciaAtual + aumentoInteligencia);
        
        int sabedoriaAtual = personagem.getSabedoria();
        int aumentoSabedoria = 1;
        personagem.setSabedoria(sabedoriaAtual + aumentoSabedoria);
        
        int carismaAtual = personagem.getCarisma();
        int aumentoCarisma = 1;
        personagem.setCarisma(carismaAtual + aumentoCarisma);

        System.out.println("Aplicando bônus racial para: " + this.getClass().getSimpleName() + "\n"
        + "+" + aumentoForca + " de Força\n"
        + "+" + aumentoDestreza + " de Destreza\n"
        + "+" + aumentoConstituicao + " de Constituição\n"
        + "+" + aumentoInteligencia + " de Inteligência\n"
        + "+" + aumentoSabedoria + " de Sabedoria\n"
        + " + " + aumentoCarisma + " de Carisma\n");
    }
    
    public String toString() {
        return "Humano";
    }
}