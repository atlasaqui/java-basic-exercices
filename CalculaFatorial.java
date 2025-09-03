public class CalculadoraFatorial {

    public static void main(String[] args) {
        
        // O número que quero calcular o fatorial
        int n = 5; 
        
        // A variável que vai armazenar o resultado do fatorial.
        
       
        long fatorial = 1; // Usei 'long' pois o valor de um fatorial cresce muito rápido, no caso vai ultrapassar um número inteiro.
                          
        if (n == 0) {
            System.out.println("O fatorial de 0 é: 1");
        } 
        
        // Se o número for maior que 0, ai começa o laço.
        else {
            // O laço começa em 1 e vai até o número n
            for (int i = 1; i <= n; i++) { 
                fatorial *= i; // ta acumulando o produto: fatorial = fatorial * i
            }
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}
