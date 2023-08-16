package modulos_numeros;

public class Centena extends Dezenas{

    private String[] Centenas = {
        "", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setecentos", "Oitocentos", "Novecentos"
    };
    private int centena;


    Centena(int num){
        super(num);
        setCentena((num / 100) % 10);
    }
    public void setCentena(int centena) {
        this.centena = centena;
    }
    public int getCentena() {
        return this.centena;
    }
    private String getCentExtensive(int n){
        for(int i = 0;i<=9;i++){
            if(i==n){
                return this.Centenas[i];
            }
        }
        return"";
    }
    public String makeExtensiveHundred(){
        String s = getCentExtensive(getCentena());
        System.out.println("teste");
        s += makeExtensiveTen(s);
        

        return s;
    }
}
