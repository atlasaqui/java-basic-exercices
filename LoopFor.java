import java.util.Scanner; // Imports the Scanner class, which is used to get user input.

public class LoopFor { // Defines a public class named Loop. In Java, all code is contained within classes.
    public static void main(String[] args) { // This is the main method, the entry point for the program. The code inside this method will be executed.
        Scanner leitura = new Scanner(System.in); // Creates a new Scanner object named 'leitura' that reads input from the standard input (the keyboard).
        double mediaAvaliacao = 0; // Declares a variable 'mediaAvaliacao' of type double and initializes it with the value 0. This variable will store the sum of all ratings.
        double nota = 0; // Declares a variable 'nota' of type double and initializes it with the value 0. This variable will temporarily store each rating entered by the user.

        System.out.println("Digite o filme assistido"); // Prints the message "Digite o filme assistido" to the console, prompting the user for input.
        String filme = leitura.nextLine(); // Reads the entire line of text entered by the user (the movie title) and stores it in the 'filme' variable.

        for (int i = 0; i < 3; i++) { // This is a 'for' loop that will execute the code block inside it exactly 3 times.
            // 'int i = 0' initializes the counter 'i' to 0.
            // 'i < 3' is the condition; the loop continues as long as 'i' is less than 3.
            // 'i++' increments the counter 'i' by 1 after each loop iteration.
            
            System.out.println("Diga sua avaliação para o filme "); // Inside the loop, this line prompts the user to enter a rating.
            nota = leitura.nextDouble(); // Reads the next double value (the rating) entered by the user and stores it in the 'nota' variable.
            mediaAvaliacao += nota; // This is a shorthand for `mediaAvaliacao = mediaAvaliacao + nota;`. It adds the value of 'nota' to the current value of 'mediaAvaliacao'. This accumulates the sum of the ratings.
        } // The loop ends here. After 3 repetitions, the program continues to the next line.

        System.out.printf("A Média de Avaliações do filme " + filme + " é de: %.2f", mediaAvaliacao / 3); // Prints the final result to the console.
        // `System.out.printf` is used for formatted printing.
        // `"A Média de Avaliações do filme " + filme + " é de: %.2f"` is the format string. It combines a static string with the value of the 'filme' variable.
        // `%.2f` is a placeholder that will be replaced by a floating-point number formatted to two decimal places.
        // `mediaAvaliacao / 3` calculates the average rating by dividing the total sum of ratings by 3.
    } // The main method ends here.
} // The class definition ends here.