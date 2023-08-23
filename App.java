import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String num = scan.nextLine();
            Controle controleDados = new Controle(num);
            controleDados.printNumeroExtenso();
            

        }
    }
}