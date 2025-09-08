import java.util.Scanner;
public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar): )");
            String entrada = leitura.nextLine();

            if (entrada.equals("fim")) {
                break;
            }
            int numero = Integer.parseInt(entrada);

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
            
        }
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        leitura.close();
    }
    
    
}
