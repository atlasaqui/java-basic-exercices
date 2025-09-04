import java.util.Scanner;
public class Desconto {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorc = leitura.nextDouble();
        double desconto = valorc * 0.10;

        if (valorc >= 100.00) {
            System.out.println("10% de desconto aplicado! ");
            System.out.println("Novo valor: " + desconto);
        } else {
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("Valor Total: " + valorc);
        }
        
    }
    
}
