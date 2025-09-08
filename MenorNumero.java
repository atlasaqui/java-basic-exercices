import java.util.Scanner;
public class MenorNumero {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        String[] numerosString = leitura.nextLine().split(" ");
        // usa o split para separar as strings por espaço.
        int menorNum = Integer.MAX_VALUE;

        for(String numeroString : numerosString) {
            int num = Integer.parseInt(numeroString);

            if (num < menorNum){
                menorNum = num;

            }
        
        }
          System.out.println("O menor número é: " + menorNum);
            leitura.close();

        }


    }
    
