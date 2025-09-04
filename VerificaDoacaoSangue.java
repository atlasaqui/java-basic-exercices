import java.util.Scanner;    

public class VerificaDoacaoSangue {      
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Digite a idade do doador: ");      
        int idade = scanner.nextInt();      

        System.out.print("Digite o peso do doador (em kg): ");      
        double peso = scanner.nextDouble();   

        boolean idadeValida = idade >= 18 && idade <= 65;      
        boolean pesoValido = peso > 50;      

        if (idadeValida && pesoValido) {      
            System.out.println("O doador é compatível para doação de sangue.");  
        } else {      
            System.out.println("O doador não é compatível. Motivo:");      
            if (!idadeValida) {      // o sinal de diferente aqui é para verificar se idadeValida for diferente do informado em cima ira printar o q tem em baixo
                System.out.println("- Deve ter entre 18 e 65 anos.");      
            }      
            if (!pesoValido) {       // o sinal de diferente aqui é para verificar se pesoValido for diferente do informado em cima ira printar o q tem em baixo
                System.out.println("- Deve pesar mais de 50 kg.");      
            }      
        } 
        scanner.close();      
    }      
}  