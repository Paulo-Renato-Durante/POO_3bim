import modulos_numeros.ControlerNumber;
public class Controle {
    private ControlerNumber controleNumber;
    private int numero;

    Controle(String numeroString){
        setNumero(tranformarInt(numeroString));
        this.controleNumber = new ControlerNumber(getNumero());
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    private int tranformarInt(String s){
        return Integer.parseInt(s);
    }
    public void printNumeroExtenso(){
        this.controleNumber.testarCasaDecimal();
    }

}
