/*@author Mariana */
package projeto.jogo;
import java.util.Random;
import java.util.Scanner;
import projeto.jogo.Classe;
import projeto.jogo.Raca;

import projeto.jogo.classes.Bardo;
import projeto.jogo.classes.Barbaro;
import projeto.jogo.classes.Bruxo;
import projeto.jogo.classes.Clerigo;
import projeto.jogo.classes.Druida;
import projeto.jogo.classes.Feiticeiro;
import projeto.jogo.classes.Guerreiro;
import projeto.jogo.classes.Ladino;
import projeto.jogo.classes.Mago;
import projeto.jogo.classes.Monge;
import projeto.jogo.classes.Paladino;
import projeto.jogo.classes.Patrulheiro;

import projeto.jogo.racas.Anao;
import projeto.jogo.racas.Draconato;
import projeto.jogo.racas.Elfo;
import projeto.jogo.racas.Gnomo;
import projeto.jogo.racas.Halfling;
import projeto.jogo.racas.Humano;
import projeto.jogo.racas.MeioElfo;
import projeto.jogo.racas.MeioOrc;
import projeto.jogo.racas.Tiefling;

public class Personagem {
    private String nome;
    private int forca = 8;
    private int destreza = 8;
    private int constituicao = 8;
    private int inteligencia = 8;
    private int sabedoria = 8;
    private int carisma = 8;
    private int ataque;
    private int defesa;
    private int vidaAtual;
    
    private int pontosDeVidaMaximo = 10;
    private int pontosAtributo = 27;

    private Raca raca; // tipo objeto(interface/raça)
    private Classe classe; // tipo objeto(interface/classe)
    
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public int getDestreza() {
        return destreza;
    }
     public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
   
    public int getConstituicao() {
        return constituicao;
    }
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }
   
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    public int getSabedoria() {
        return sabedoria;
    }
    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }
    
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Raca getRaca() {
        return raca;
    }
    public void setRaca(Raca raca) {
        this.raca = raca;
    }
    
    public Classe getClasse() {
        return classe;
    }
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public int getDefesa() {
        return defesa;
    }        
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }
    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }
     
    
    public static Raca escolherRaca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
            + "Escolha a raça do personagem: \n"
            + "[1] Anão\n [2] Elfo\n [3] Halfling\n" 
            + "[4] Humano\n [5] Draconato\n [6] Gnomo\n" 
            + "[7] MeioElfo\n [8] MeioOrc\n [9] Tiefling\n"
            + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n");

        int escolhaRaca = scanner.nextInt();
        Raca racaEscolhida = null;

        switch (escolhaRaca) {
            case 1 -> racaEscolhida = new Anao();
            case 2 -> racaEscolhida = new Elfo();
            case 3 -> racaEscolhida = new Halfling();
            case 4 -> racaEscolhida = new Humano();
            case 5 -> racaEscolhida = new Draconato();
            case 6 -> racaEscolhida = new Gnomo();
            case 7 -> racaEscolhida = new MeioElfo();
            case 8 -> racaEscolhida = new MeioOrc();
            case 9 -> racaEscolhida = new Tiefling();
            default -> System.out.println("Escolha inválida.");
        }
        return racaEscolhida;
    }

    public static String escolherNome(Scanner scanner) {
        System.out.println(
                "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
                + "Escolha o nome do personagem com base na raça que você escolheu: \n"
                + "[1] Anão → 'Amber' \n [2] Elfo → 'Lia'\n [3] Hafling → 'Cora'\n"
                + "[4] Humano → 'Tai'\n [5] Draconato → 'Akra'\n [6] Gnomo → 'Tana'\n" 
                + "[7] MeioElfo → 'Gala'\n [8] MeioOrc → 'Vola'\n [9] Tiefling → 'Rieta'\n"
                + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n");
        
        int escolhaNome = scanner.nextInt();
        String nomeEscolhido = null;
        
        switch (escolhaNome) {
            case 1 -> nomeEscolhido = "Amber";
            case 2 -> nomeEscolhido = "Lia";
            case 3 -> nomeEscolhido = "Cora";
            case 4 -> nomeEscolhido = "Tai";
            case 5 -> nomeEscolhido = "Akra";
            case 6 -> nomeEscolhido = "Tana";
            case 7 -> nomeEscolhido = "Gala";
            case 8 -> nomeEscolhido = "Vola";
            case 9 -> nomeEscolhido = "Rieta";
            default -> System.out.println("Escolha inválida.");
        }
        return nomeEscolhido;
    }
 
    public static Classe escolherClasse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
                + "Escolha a classe do personagem: \n"
                + "[1] Bárbaro\n [2] Bardo\n [3] Bruxo\n"
                + "[4] Clérigo\n [5] Druida\n [6] Feiticeiro\n"
                + "[7] Guerreiro\n [8] Ladino\n [9] Mago\n"
                + "[10] Monge\n [11] Paladino\n [12] Patrulheiro\n"
                + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n");

        int escolhaClasse = scanner.nextInt();
        
        Classe classeEscolhida = null;

        switch (escolhaClasse) {
            case 1 -> classeEscolhida = new Barbaro();
            case 2 -> classeEscolhida = new Bardo();
            case 3 -> classeEscolhida = new Bruxo();
            case 4 -> classeEscolhida = new Clerigo();
            case 5 -> classeEscolhida = new Druida();
            case 6 -> classeEscolhida = new Feiticeiro();
            case 7 -> classeEscolhida = new Guerreiro();
            case 8 -> classeEscolhida = new Ladino();
            case 9 -> classeEscolhida = new Mago();
            case 10 -> classeEscolhida = new Monge();
            case 11 -> classeEscolhida = new Paladino();
            case 12 -> classeEscolhida = new Patrulheiro();
            default -> System.out.println("Escolha inválida.");
        }
        return classeEscolhida;
    }

    public void atributosPersonagem() {
        Scanner lerDigitado = new Scanner(System.in);
        int atributo;
        int valorPontos = 0;

        while (this.pontosAtributo > 0) {
            System.out.println(
                    "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
                    + "Seu nome é: " + nome + "\n"
                    + "Sua raça é: " + this.raca + "\n"
                    + "Sua classe é: " + this.classe.getClass().getSimpleName() + "\n"
                    + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
                    + "Você tem: " + pontosAtributo + " pontos de atributos para distribuir. Escolha um atributo:\n"
                    + "[1] Força\n [2] Destreza\n [3] Constituição\n"
                    + "[4] Inteligencia\n [5] Sabedoria\n [6] Carisma\n"
                    + "[7] Ataque\n [8]Defesa\n [9]vidaAtual\n"
                    + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n");
            atributo = lerDigitado.nextInt();

            System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n" + "Qual o valor que você deseja atribuir?");
            valorPontos = lerDigitado.nextInt();
            
            switch (atributo) {
                case 1:
                    this.forca += valorPontos;
                    break;
                case 2:
                    this.destreza += valorPontos;
                    break;
                case 3:
                    this.constituicao += valorPontos;
                    break;
                case 4:
                    this.inteligencia += valorPontos;
                    break;
                case 5:
                    this.sabedoria += valorPontos;
                    break;
                case 6:
                    this.carisma += valorPontos;
                    break;
                case 7:
                    this.ataque += valorPontos;
                    break;                    
                case 8:
                    this.defesa += valorPontos;
                    break;                    
                case 9:
                    this.vidaAtual += valorPontos;
                    break;                   
            }
            pontosAtributo -= valorPontos;
        }
    }
    
    public void aplicarBonusRacial() {
        this.raca.aplicarBonusRacial(this);
    }
    
    public void aplicarBonusProeficiencia() {
        this.classe.aplicarBonusProeficiencia(this);
    }
    
    public Personagem(String nome, Raca raca, Classe classe) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.ataque = calcularAtaque();
        /*this.aplicarBonusRacial();
        this.aplicarBonusProeficiencia();*/
    }
        
    public void exibirStatus() {
        System.out.println(
                "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n"
                + "Status de: " + nome + "\n" 
                + " [Força] " + forca 
                + " [Destreza] " + destreza 
                + " [Constituição] " + constituicao 
                + " [Inteligencia] " + inteligencia + "\n"
                + " [Sabedoria] " + sabedoria 
                + " [Carisma] " + carisma 
                + " [Ataque] " + ataque 
                + " [Defesa] " + defesa 
                + " [Pontos de Vida] " + vidaAtual 
                + " / " + pontosDeVidaMaximo + "\n"
                + "=-=-=-=-=-=-=-==-=-=-=-=-=-=-=\n");
    }
    
    public void batalhar(Personagem oponente) {
        System.out.println("=-=-=-=-=-=-=-=\n" 
                + "##### BATALHA\n"
                + "[" + this.nome + "]" +" X " + "[" + oponente.getNome() + "]" + "\n");

        Random random = new Random();

        int ataquePersonagem = this.ataque + random.nextInt(20) + 1;
        int defesaOponente = oponente.getDefesa();

        System.out.println(this.nome + " ataque: " + ataquePersonagem
                + oponente.getNome() + " defesa: " + defesaOponente);

        if (ataquePersonagem > defesaOponente) {
            int dano = random.nextInt(6) + 1;
            oponente.vidaAtual -= dano;
            System.out.println(this.nome + " atacou com sucesso! " 
                    + oponente.getNome() + " sofreu " + dano + " pontos de dano.\n");
        } else {
            System.out.println(this.nome + " errou o ataque!\n");
        }

        System.out.println("=-=-=-=-=-=-=-= \n");

        this.exibirStatus();
        oponente.exibirStatus();
    }
    
    public int calcularAtaque() {
        return this.forca + this.destreza;
    }
    
    public int calcularPontosDeVida() {
        return 10 + (int) Math.pow(this.constituicao, 0.5);
    }
}