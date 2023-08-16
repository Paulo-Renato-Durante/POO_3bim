package modulos_numeros;

public class Milhar extends Dezenas {
    private int Milhar;
    Milhar(int num){
        super(num);
        setMilhar((num / 1000) % 10);;
    }
    public int getMilhar() {
        return this.Milhar;
    }
    public void setMilhar(int milhar) {
        this.Milhar = milhar;
    }
}
