import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial do numero " + numero + " é: " + fatorial);

    }
}
