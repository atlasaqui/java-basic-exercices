public class FilmeCatalogo {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.4;
        String tipoPlano = "Plus";

            if(anoDeLancamento >= 2025){
                System.out.println("Lançamentos que os clientes estão curtindo!"); //System.out.println sempre vai quebrar uma linha.
            } else {
                System.out.println("Filme retro que vale a pena assistir!");

            }
            if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
                System.out.printf("Love, Rosie - Filme de Romance com nota %f!", notaDoFilme); //System.out.printf (formata o texto).
                System.out.printf("Plano Plus, Filme Liberado!");
            

            } else {
                System.out.println("Deve adquirir o plano Plus para ter Acesso a esse conteúdo.");
            }

    }
    
}
