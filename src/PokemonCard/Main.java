/*
 * Classname: EQ3
 *
 * Author: Faisal Richard D. Tamano Jr.
 *
 * Date: 2023/06/19
 *
 * Description: PokemonCard.Main part of the program.
 */

package PokemonCard;
import java.io.*;
import java.util.Scanner;

public class Main {

    // Constants/Attributes/Variables
    private static final String pokemonData = "Pokemon.txt";

    public static void main(String[] args) {
        // TODO:
        System.out.println("Hello world!");
        String[] stats = loadStats();

        // for testing purposes
        for (int i = 0; i < 19; i++){
            System.out.println(stats[i]);
        }
    }

    private static String[] loadStats() {
        // TODO:
        try {

            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader("assets/" + pokemonData);

            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);
            String[] pokemonStats;

            // Read and display the lines
            while (text.hasNext()) {
                String line = text.nextLine();

                // Splits this string around matches of the given regular expression.
                pokemonStats = line.split(",");

            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        } finally {
            return pokemonStats;
        }
    }
}