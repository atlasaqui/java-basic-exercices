public class Lista {
    public static void main(String[] args) {
        System.out.println("Esse é o ScreenMatch:");
        System.out.println("Filme: Amor e outras Drogas!");
        System.out.println("Filme: Simplesmente Acontece(Love, Rosie)");
        System.out.println("Filme: A Culpa é das Estrelas.(The Fault in our Stars.)");

        int anoDeLancamennto = 2015;
        System.out.println ("Ano de lançamento: " + anoDeLancamennto);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;

        double media = 9.8 + 6.3 + 7.4 /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
    Filme: Simplesmente Acontece.

            Best friends Rosie and Alex are suddenly separated when
            Alex and his family move from Dublin to America. 
            Can their friendship survive years and distance? 
            Will they gamble everything for true love?
    Ano de Lançamento:
         """ + anoDeLancamennto;
          System.out.println(sinopse);
          System.out.println(incluidoNoPlano);
          System.out.println(notaDoFilme);


    }

}
