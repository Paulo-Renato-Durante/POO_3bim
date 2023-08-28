
public class Milhar extends Centena {
    private int Thousand;

    Milhar(int num){
        super(num);
        setThousand((num / 1000) % 10);
    }
    public int getThousand() {
        return this.Thousand;
    }
    public void setThousand(int Thousand) {
        this.Thousand = Thousand;
    }
    private String getThousandExtensive(){
        if(getThousand()>0){
            return arrayNumerosExtensos[getThousand()] + " mill";
        }
        return "" ;
    }
    public String makeExtensivethousand(){
        String s = "";
        s = getThousandExtensive();
        s += makeExtensiveHundred();
        return s;
    }
}
