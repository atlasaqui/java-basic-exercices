import java.util.Scanner;
public class SenhaDBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        final String senhaCorreta = "1234"; //a senha correta no final do programa

        for (int tentativasSenha = 3; tentativasSenha > 0; tentativasSenha--) { // enquanto tentativas de senha for maior q zero, você ainda é capaz de usar a senha.
            System.out.println("Digite sua senha: ");
            String senha = leitura.nextLine(); //vai ler a senha como string

            if (senha.equals(senhaCorreta)) { // se a senha digitada der match com senhaCorreta é sucesso.
                System.out.println("Senha correta ! Acesso concedido.");
                break;
            }else if (tentativasSenha > 1) { //enquanto a tentativa for maior que um vc ainda tera esse texto informando.
                System.out.println("Senha incorreta. Você tem " + tentativasSenha + " tentativas restantes.");

            }else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        leitura.close();

        }

    }
    