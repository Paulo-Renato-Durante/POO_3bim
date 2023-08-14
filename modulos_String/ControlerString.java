package modulos_String;

public class ControlerString {
    
    
    public boolean verificaNumeroInteiro1(String s) {
        if (s.matches("-?\\d+")) {
            return true;
        }
        return false;
    }
    public boolean verificaNumeroInteiro2(String s) {
        try{
            int num = Integer.parseInt(s);
            return true;   
        } catch (Exception e) {
            return false;
        }
    }

}
