import java.util.Scanner;
public class CalculadoraDeNota {
 public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println(" ********************* \nSistema de Notas do Aluno: \n *********************");
        System.out.println("Informe o nome do aluno: ");
        
        String nomeAluno = leitura.nextLine();

        System.out.println("Agora informe a primeira nota de " + nomeAluno);
        Double nota1 = leitura.nextDouble();
        System.out.println("Informe a segunda nota: ");
        Double nota2 = leitura.nextDouble();
        
        Double media = (nota1 + nota2) /2;

        String situ; //preciso declarar fora pois não vou ter acesso após os 'if' na hora do resultado.

        if (media >= 7) {
            situ = "APROVADO POR MÉDIA";

        } else if (media >= 5.0 && media <= 6.9) {

            situ = "APROVADO";

        } else {

            situ = "Reprovado";

        }

        double mNota;

        if (nota1 > nota2) {
            mNota = nota1;

        } else {
            mNota = nota2;
        }

        // Agora o Resultado
        System.out.println("*********************\nRELÁTORIO DO ALUNO \n *********************");
        System.out.println("Nome: " + nomeAluno);
        System.out.print("Primeira Nota: " + nota1 + "\n");
        System.out.print("Segunda Nota: " + nota2 + "\n");
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situ);
        System.out.println("Nota de destaque: " + mNota);

        leitura.close();




    }
    
}
