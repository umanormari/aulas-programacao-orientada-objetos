/*@author Mariana */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import projeto.jogo.Personagem;
import projeto.jogo.Raca;
import projeto.jogo.Classe;
import java.util.Scanner;

public class ProjetoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do primeiro personagem
        Raca racaEscolhida1 = Personagem.escolherRaca();
        String nomeEscolhido1 = Personagem.escolherNome(scanner);
        Classe classeEscolhida1 = Personagem.escolherClasse();
        Personagem personagem1 = new Personagem(nomeEscolhido1, racaEscolhida1, classeEscolhida1);
        personagem1.atributosPersonagem();
        personagem1.aplicarBonusRacial();
        personagem1.aplicarBonusProeficiencia();
        personagem1.exibirStatus();

        //Criação do segundo personagem
        Raca racaEscolhida2 = Personagem.escolherRaca();
        String nomeEscolhido2 = Personagem.escolherNome(scanner);
        Classe classeEscolhida2 = Personagem.escolherClasse();
        Personagem personagem2 = new Personagem(nomeEscolhido2, racaEscolhida2, classeEscolhida2);
        personagem2.atributosPersonagem();
        personagem2.aplicarBonusRacial();
        personagem2.aplicarBonusProeficiencia();
        personagem2.exibirStatus();

        // Batalha entre os dois personagens
        personagem1.batalhar(personagem2);
 
    /*try {
        FileOutputStream fileOutput = new FileOutputStream("save.txt");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        
        objectOutput.writeObject(personagem1);
        
        fileOutput.close();
        objectOutput.close();
        } catch (Exception erroGenerico){
            System.out.println("Erro");
            erroGenerico.getMessage();
            erroGenerico.printStackTrace();
        }*/
    }
}