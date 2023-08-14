import java.util.Scanner;
import modulos_String.ControlerString;

class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ControlerString control = new ControlerString();
        Controle controleDados = new Controle();

        while(true){

            System.out.println("Digite o numero que deseja escrever por extenso:");
            String num = scan.nextLine();


            if(control.verificaNumeroInteiro1(num)){
                
            }

        }
    }
}