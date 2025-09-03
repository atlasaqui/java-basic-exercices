import java.util.Scanner; // Imports the Scanner class, which allows us to read user input.

public class LoopWithWhile { // Defines a public class named LoopWithWhile.
    public static void main(String[] args) { // This is the main method, the entry point for the program.
        Scanner Leitura = new Scanner(System.in); // Creates a new Scanner object to read input from the keyboard.
        double mediaAvaliacao = 0; // Declares a variable 'mediaAvaliacao' to store the sum of ratings, initialized to 0.
        double nota = 0; // Declares a variable 'nota' to temporarily store each rating entered by the user, initialized to 0.
        int totalDeNotas = 0; // Declares an integer variable 'totalDeNotas' to count the number of ratings, initialized to 0.

        while (nota != -1) { // Thisn 'while' loop will continue to run as long as the 'nota' variable is NOT equal to -1.
            System.out.println("Diga sua Avaliação para o filme ou -1 para encerrar."); // Prompts the user to enter a rating or -1 to exit.
            nota = Leitura.nextDouble(); // Reads the double value entered by the user and stores it in the 'nota' variable.

            if (nota != -1) { // Checks if the entered value is NOT -1. This prevents -1 from being included in the calculation.
                mediaAvaliacao += nota; // Adds the current rating ('nota') to the total sum of ratings ('mediaAvaliacao').
                totalDeNotas++; // Increments the total count of ratings by one.
            }
        } // The loop ends here when the user enters -1.
        System.out.println("Média de Avaliações: " + mediaAvaliacao / totalDeNotas); // Calculates the average rating (total sum divided by the count) and prints the result to the console.

        //COMENTEI EM INGLÊS, POIS ESTAVA ESTUDANDO A LÍNGUA.
    }

}
