
public class Controle {
    private String NumeroString;
    private int Numero;
    private Milhar Milhar;
    private String NumeroExtenso;

    Controle(String numeroString){
        setNumero(tranformarInt(numeroString));
    }
    public void setNumero(int numero) {
        this.Numero = numero;
    }
    public int getNumero() {
        return this.Numero;
    }
    private int tranformarInt(String s){
        return Integer.parseInt(s);
    }
    public void setNumeroExtenso(String numeroExtenso) {
        this.NumeroExtenso = numeroExtenso;
    }
    public String getNumeroExtenso() {
        return this.NumeroExtenso;
    }
    public void printNumeroExtenso(){
        this.Milhar = new Milhar(getNumero());
        String s = this.Milhar.makeExtensiveHundred();
        setNumeroExtenso(s);
        System.out.println(getNumeroExtenso());
    }

}
