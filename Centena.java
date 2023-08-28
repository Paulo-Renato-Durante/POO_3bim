public class Centena extends Dezena{

    private String[] Centenas = {
        "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };
    private int centena;


    Centena(int num){
        super(num);
        setCentena((num / 100) % 10);
    }
    public void setCentena(int num) {
        this.centena = num;
    }
    public int getCentena() {
        return this.centena;
    }
    private String getCentExtensive(){

        return this.Centenas[getCentena()];
    }
    private String testConcatOrNo(String s){
        if(getNum()/1000 <= 0 ){
            return s;
        }
        return concatEIntoString(s);
    }
    private boolean testIfEndWhithzeros(){
        if(getUnidade() == 0&& getDezena()==0){
            return true;
        }
        return false;
    }
    public String makeExtensiveHundred(){
        String s = "";
        s += getCentExtensive();
        
        if(testIfEndWhithzeros()){
            return testConcatOrNo(s);
        }
        s += makeExtensiveTen();
        return " "+s;
    }
}
