package modulos_numeros;

public class Dezenas extends Unidade {
    private int dezena;


    Dezenas(int num){
        super(num);
        this.dezena=(num / 10) % 10;
    }
    public void setDezena(int dezena) {
        this.dezena = dezena;
    }
}
