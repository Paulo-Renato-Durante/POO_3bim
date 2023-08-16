package modulos_numeros;

public class Dezenas extends Unidade {
    private int Dezena;
    private String[] Dezenas = {
        "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };

    private String[] diferentes = {
        "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    Dezenas(int num){
        super(num);
        setDezena((num / 10) % 10);
    }
    public void setDezena(int dezena) {
        this.Dezena = dezena;
    }
    public int getDezena() {
        return this.Dezena;
    }
    private String getTenExtensive(int n){
        for(int i = 0;i<=9;i++){
            if(i==n){
                return this.Dezenas[i];
            }
        }
        return"";
    }
    private boolean testNormalTen(){
        if(getDezena()>1){
            return true;
        }
        return false;
    }
    public String makeExtensiveTen(String s){
        System.out.println("teste");
        if(testNormalTen()){
            s += getTenExtensive(getDezena());
        }
        return s;
    }
}
