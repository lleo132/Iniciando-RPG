import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     
   //Instanciando a classe "PERSONAGEM" para utiliza-lá
    Personagem heroi = new Personagem();
    //Chamando a classe "Scanner" para poder receber dados
    Scanner sc = new Scanner(System.in);
   //Perguntando o nome que o heroi terá e o definindo para dentro da classe
    System.out.println("Informe o nome do seu Heroi!: ");
    heroi.setName(sc.nextLine());
    //Definindo a força do personagem
    System.out.println("Informe sua força:");
    heroi.setForca(sc.nextInt());
    //Definindo o poder
    System.out.println("Defina seu poder");
    heroi.setPoder(sc.nextInt());
    //Chamando o metodo publico que irá trabalhar com os dados de entrada
    heroi.CadastrarPersonagem(); 
    //Iniciando a jogalidade
    Armamento arm = new Armamento();
    System.out.println("Escolha a primeira arma");
    arm.arma[0] = sc.next();
    System.out.println("Escola a segunda arma:");
    arm.arma[1] = sc.next();
    System.out.println("Escolha a terceira arma");
    arm.arma[2] = sc.next();
    arm.DefinaArma();
    System.out.println("Escolha uma das opçoes a baixo");
    System.out.println("Você pode digitar de 1 ate 3 para escolher um tipo de ataque! Escola com sabedoria");
    heroi.setAtacar(sc.nextInt()); 
    heroi.Ataque();
    
    //Tente novamente
    Personagem vilao = new Personagem();
    Scanner sv = new Scanner(System.in);
    //Perguntando o nome que o heroi terá e o definindo para dentro da classe
    System.out.println("Informe o nome do seu Vilão!: ");
    vilao.setName(sv.nextLine());
    //Definindo a força do personagem
    System.out.println("Informe sua força:");
    vilao.setForca(sv.nextInt());
    //Definindo o poder
    System.out.println("Defina seu poder");
    vilao.setPoder(sv.nextInt());
    //Chamando o metodo publico que irá trabalhar com os dados de entrada
    vilao.CadastrarPersonagem(); 
    //Iniciando a jogalidade
    System.out.println("Escolha uma das opçoes a baixo");
    System.out.println("Você pode digitar de 1 ate 3 para escolher um tipo de ataque! Escola com sabedoria");
    vilao.setAtacar(sv.nextInt()); 
    vilao.Ataque(); 
 }
    }
