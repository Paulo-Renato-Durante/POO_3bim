

public class Unidade {
    private int num;
    private int unidade;
    public String[] arrayNumerosExtensos  = {"","um","dois","tres","quatro","cinco","seis","sete","oito","nove"};


    Unidade(int num){
        setNum(num);
        setUnidade(num%10);
    }
    public String makeExtensiveUnit(){
        String s ="";
        if(getNum()!=0){
            s = (arrayNumerosExtensos[getUnidade()]);
            if(getUnidade()==0 ||getNum()/10<=0 ){
                return s;
            }
            return concatEIntoString(s);
        }
        return "zero";
        
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public int getUnidade() {
        return unidade;
    }

    public String concatEIntoString(String s){
        return " e "+ s;
    }
}
