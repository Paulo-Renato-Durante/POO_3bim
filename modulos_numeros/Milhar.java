package modulos_numeros;

public class Milhar extends Dezenas {
    private int milhar;
    Milhar(int num){
        super(num);
        setMilhar((num / 1000) % 10);;
    }
    public void setMilhar(int milhar) {
        this.milhar = milhar;
    }
}
