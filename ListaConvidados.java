import java.util.ArrayList;
import java.util.Scanner;
 
public class ListaConvidados {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>(); // criei uma lista aqui, onde so pode armazenas objetos tipo string.
        // a lista ta vazia no inicio mas ira guardar depois os nomes inseridos pelo user.

        while (true) {  //crio um loop infinito até ter um comando que mostre que é para parar.
            System.out.println("Digite o nome os convidados: (ou digite 'ver' para visualizar a lista 'sair' para finalizar)");
            String nome = leitura.nextLine();

            if (nome.equalsIgnoreCase("sair")) { //verifica se o texto digitado é 'sair'
                System.out.println("Programa Finalizado!");
                break; //se o texto for sair, ele finaliza.
            }
            if (nome.equalsIgnoreCase("ver")){ //aqui se digitar 'ver' irá pegar todos os nomes da lista digitados anteriormente.
                System.out.println("Lista atualizada de Convidados: " + convidados);

                continue; // esse comando faz com que o loop pule para a proxima fase, assim o programa n finalizar instantaneamente.
            }
            boolean jaExiste = false; //aqui eu crio uma variavel boolean para verificar se um nome esta na lista ou não.

            for(String convidado : convidados) { //loop for each que vai percorrer cada elemento da lista para verificar se existe ou não um nome igual.
                if(convidado.toLowerCase().equals(nome.toLowerCase())) { //Dentro do loop, ele compara o nome atual da lista (convidado) com o nome que o usuário acabou de digitar (nome). Ele usa o .toLowerCase() para garantir que a comparação não seja afetada por letras maiúsculas ou minúsculas. Se os nomes forem iguais...
                    jaExiste = true; // a variavel muda para true, logo o nome ja existe.
                    break;
                }
            }

            if (jaExiste) {
                System.out.println("O nome" + "Já existe na lista de convidados");
                //se a variavel jaExiste mudar para true irá rodar essa frase dizendo que ja esta na lista.

            } else {
                convidados.add(nome); //se não estiver na lista, irá adicionar.
                System.out.println(nome + "foi adicionado à lista de convidados!");

            }
            
        }
        leitura.close();
    }
}
 
 
        