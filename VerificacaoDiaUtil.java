import java.util.Scanner;     

public class VerificacaoDiaUtil {     
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Digite o dia da semana (em letras minúsculas): ");      
        String dia = scanner.nextLine(); 
        scanner.close();      

        if (dia.equals("segunda") || dia.equals("terca") ||    // || é usado como OU //dia.eaquals ta verificando se é um dos dias da semana citados e mancionados no if.
            dia.equals("quarta") || dia.equals("quinta") ||      
            dia.equals("sexta")) {      
            System.out.println(dia + " é um dia útil.");      
        } else {      
            System.out.println(dia + " não é um dia útil.");      
        }      
    }      
}   