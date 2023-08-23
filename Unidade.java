

public class Unidade {
    private int unidade;
    private String unidadeString;
    private String[] arrayNumerosExtensos  = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove"};
    

    Unidade(int num){
        setUnidade(num%10);
    }
    public String makeExtensiveUnit(){
        for(int i = 0;i<=9;i++){
            if(getUnidade()==i){
                return arrayNumerosExtensos[i];
            }
        }
        return"";
    }
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public int getUnidade() {
        return unidade;
    }
    public void setUnidadeString(String unidadeString) {
        this.unidadeString = unidadeString;
    }
    public String getUnidadeString() {
        return unidadeString;
    }
}
