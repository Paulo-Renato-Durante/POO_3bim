import modulos_numeros.ControlerNumber;
public class Controle {
    private ControlerNumber controleNumber;
    private int Numero;
    private String NumeroExtenso;

    Controle(String numeroString){
        setNumero(tranformarInt(numeroString));
        this.controleNumber = new ControlerNumber(getNumero());
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
        String s = this.controleNumber.gerarNumeroExtenso();
        setNumeroExtenso(s);
        System.out.println(getNumeroExtenso());
    }

}
