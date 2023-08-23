
public class Milhar extends Centena {
    private int Milhar;

    Milhar(int num){
        super(num);
        setMilhar((num / 1000) % 10);
    }
    public int getMilhar() {
        return this.Milhar;
    }
    public void setMilhar(int milhar) {
        this.Milhar = milhar;
    }
}
