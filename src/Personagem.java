import javax.swing.JOptionPane;

public class Personagem {
    //Atributos da classe ou seja, as caracteristicas do "Objeto"
   private String name;
   private int nivel;
   private int forca;
   private int poder;
   private int atacar;
    
   //Metodos da classe, ou seja, os comportamentos que precisamos que essa classe exerça

   //Metodo que irá cadastrar o personagem, dá boas vindas e chamar outro metodo para definir a força, poder e nivel que esse personagem terá
    void CadastrarPersonagem() {
        System.out.println("Bem vindo, " + this.name);
        DefinirForca();
        
    }
    
    //Metodo que ira definir a 'força" em geral deste personagem
    private void DefinirForca() {
        
        if(this.forca >= 100 && this.poder >=100) {
            nivel = (forca - 50) - poder; 
            System.out.println("Sua força foi definida para:" + this.forca);
            System.out.println("Seu poder foi definido para: " + this.poder);
            System.out.println("O seu nivel foi definido para: " + nivel + "lvl");
        } else {
            nivel = 100;
            System.out.println("Sua força foi definida para:" + this.forca);
            System.out.println("Seu poder foi definido para: " + this.poder);
            System.out.println("Seu nivel é:" + nivel + "lvl");
        }
    }
    //Metodo que ira executar uma ação de ataque
    public void Ataque() {
        Armamento arm = new Armamento();
        switch(this.atacar) {
            case 1:
            System.out.println(this.name + " Atacou e acabou morrendo, crie outro personagem e tente novamente");
                 break;
            case 2:
                System.out.println(this.name + " Atacou de forma bem sucedida, parabens!! ");
                break;
            case 3:
            System.out.println("Ataque mal sucedido, você escapou por pouco dessa, tente novamente assim que se recuperar");
                 break;
            default:
            System.out.println("Voce " + this.name + " é uma vergonha! Não aceitamos covardes por aqui!!"); 
            System.out.println("------------GAME OVER--------------");     
        } 
        
    }

   


    //Metodos getters e setters, que são utilizados para que uma classe de fora acesse os atributos desta
    public String getNome() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAtacar() {
        return atacar;
    }

    public void setAtacar(int atacar) {
        this.atacar = atacar;
    }

    








    
}
  


    
    




