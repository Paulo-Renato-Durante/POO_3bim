package modulos_numeros;

public class Centena extends Dezenas{
    private int centena;
    Centena(int num){
        super(num);
        setCentena((num / 100) % 10);
    }
    public void setCentena(int centena) {
        this.centena = centena;
    }
}
