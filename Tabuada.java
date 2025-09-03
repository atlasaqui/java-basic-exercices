import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = Leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) { //"i" é uma variavel, ou seja posso mudar o nome se precisar.
            // int i = 1: O loop começa criando uma variável chamada i e dando a ela o valor1.
            // i <= 10; Esta é a condição para o loop continuar. Enquanto o valor de i for menor ou igual a 10, o loop vai continuar rodando.
            // i++: Depois que o código dentro do loop é executado, esta parte aumenta o valor de i em 1.
            // i++é uma forma abreviada de escrever i = i + 1. 
            // A ideia é que a cada "volta", o contador i mude de valor para que, eventualmente, a condição (i <= 10) se torne falsa
            System.out.println(numero + " x " + i + " = " + (numero * i));
            /// System.out.println(numero + " x " + i + " = " + (numero * i));: 
            /// Esta é a linha que é executada repetidamente dentro do loop. 
            /// Ela calcula e imprime o resultado da multiplicação.
            /// 
        }
    }
    
}
