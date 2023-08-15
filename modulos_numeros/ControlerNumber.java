package modulos_numeros;

public class ControlerNumber{
    private String numeroString;
    private int numero;
    private Centena centena;
    private Milhar milhar;
    private Unidade unidade;
    private Dezenas dezena;

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
    public void testarCasaDecimal(){
        if(getNumero()/1000 >=1){
            milhar = new Milhar(getNumero());
        }else{
            centena= new Centena(getNumero());
        }
    }
}