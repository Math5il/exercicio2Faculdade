import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);

        int numeroInformado = 0;

        System.out.println("Digite um número");
        numeroInformado = console.nextInt();

        System.out.println("O número digitado foi: " + numeroInformado); 
    }
}
