import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite os numero separados por espaço: ");

        String[] numerosStr = leitura.nextLine().split(" ");
        //Essa linha de cima, é importante, pois lê toda a linha digitada pelo usuario e armazena como uma String
        //A variavel numerosStr vai conter essa string com todos os numeros digitados.
        //O metodo split divide a string em varias partes usando o "Espaço" que foi indicado no metodo
        int maiorNum = Integer.MIN_VALUE;
        // essa variavel é criada para armazenar o maior numero encontrado até o momento.
        //Integer.MIN_VALUE faz com que seja iniciado com o menor número possivel.
        //Isso garante que o primeiro número digitado pelo usuário será, obrigatoriamente, maior do que o valor inicial.
        for(String numStr : numerosStr){
            //Percorre cada elemento do array numeros Str.
            //a variável numStr recebe o valor de um dos elementos do array
            int num = Integer.parseInt(numStr);
            //Dentro do loo Integer.parseInt converte a String atual para um numero inteiro.
            // é necessario se não só sera lido como texto então dará ero.
            if (num > maiorNum){
                maiorNum = num;
                // se a condição for verdadeira, ela será atualizada.( se o num for maior que maiorNum.)
                // se a condição for falsa ele vai pular para o proximo numero da lista.
            }
        }
        System.out.println("O maior número é: " + maiorNum);
        leitura.close();


    }
    
}
