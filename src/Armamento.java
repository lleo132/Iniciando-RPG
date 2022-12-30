public class Armamento {
    String [] arma = new String[3];
    private int dano;
    private int durab;
    
    
    void DefinaArma() { 
         this.arma[0] = arma[0];
         this.arma[1] = arma[1];
         this.arma[2] = arma[2];    
            
       System.out.println(arma[0] + " Equipada com sucesso");     
       System.out.println(arma[1] + " Equipada com sucesso");
       System.out.println(arma[2] + " Equipada com sucesso");     
    }


    public String[] getArma() {
        return arma;
    }


    public void setArma(String[] arma) {
        this.arma = arma;
    }


    public int getDano() {
        return dano;
    }


    public void setDano(int dano) {
        this.dano = dano;
    }


    public int getDurab() {
        return durab;
    }


    public void setDurab(int durab) {
        this.durab = durab;
    }
    
    //Getters and Setters da classe Armamento  





    

}


  

 