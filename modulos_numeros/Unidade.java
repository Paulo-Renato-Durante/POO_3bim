package modulos_numeros;

public class Unidade {
    private int unidade;
    private String[] arrayNumerosExtensos  = {"zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove"};
    
    Unidade(int num){
        unidade = num%10;
    }
}
