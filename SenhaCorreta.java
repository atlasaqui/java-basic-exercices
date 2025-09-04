import java.util.Scanner;
public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senha = "12345";
        System.out.println("Digite a senha correta: ");
        String tentativaSenha = leitura.nextLine();

        if(tentativaSenha.equals(senha)) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");

    }
    
}
