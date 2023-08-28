public class Dezena extends Unidade {
    private int Dezena;
    private String[] Dezenas = {
        "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    private String[] Diferentes = {
        "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    Dezena(int num){
        super(num);
        setDezena((num / 10) % 10);
    }
    public void setDezena(int dezena) {
        this.Dezena = dezena;
    }
    public int getDezena() {
        return this.Dezena;
    }
    private String getTenExtensive(){
        return this.Dezenas[getDezena()];
    }
    private boolean testNormalTen(){
        if(getDezena()>1|| getDezena() == 0){
            return true;
        }
        return false;
    }
    private String testConcatOrNo(String s){
        if(getNum()/100 <= 0 ){
            return s;
        }
        return concatEIntoString(s);
    }
    private String getDiferentTenExtensive(){
        if(getDezena() ==0){
            return "";
        }
        return Diferentes[getUnidade()];
    }
    public String makeExtensiveTen(){
        String s = "";
        if(testNormalTen()){
            s += getTenExtensive();
            s += makeExtensiveUnit();
            return testConcatOrNo(s);
        }
        s += getDiferentTenExtensive();
        return testConcatOrNo(s) ;


    }
}
