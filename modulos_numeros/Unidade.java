package modulos_numeros;

public class Unidade {
    private int unidade;
    private String[] arrayNumerosExtensos  = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove"};
    
    Unidade(int num){
        setUnidade(num%10);
        System.out.println(getUnidade());
    }
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public int getUnidade() {
        return unidade;
    }
}
