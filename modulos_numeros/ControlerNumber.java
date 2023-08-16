package modulos_numeros;

public class ControlerNumber{
    private String numeroString;
    private int numero;
    private Centena centena;
    private Milhar milhar;

    public ControlerNumber(int num){
        setNumero(num);

    }
    
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumeroString(String numeroString) {
        this.numeroString = numeroString;
    }
    public String getNumeroString() {
        return numeroString;
    }
    public boolean testarCasaDecimal(){
        if(getNumero()/1000 >=1){
           return true;
        }
        return false;
    }
   
   
   
    public String gerarNumeroExtenso(){
        if(testarCasaDecimal()){
            milhar = new Milhar(getNumero());
            return"";
        }else{
            centena = new Centena(getNumero());
            return centena.makeExtensiveHundred();
        }

       
    }
}