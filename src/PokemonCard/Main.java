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
        System.out.println("Hello LBYCPEI!");
        String[][] database = loadStats();
    }

    /*
     * Returns a string array containing statistics involving pokemons found in the pokemonData
     *
     * Usage: loadStats();
     */
    private static String[][] loadStats() {
        String[][] pokemonStats = new String[1000][7]; //Pokemon stat array containing each pokemon and  their attributes
        try {

            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader("assets/" + pokemonData);

            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);

            // Add each pokemon stat in an array
            int i = 0;
            while (text.hasNext()) {
                String line = text.nextLine();

                // Splits this string around matches of the given regular expression.
                pokemonStats[i] = line.split(",");
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        }
        return pokemonStats;
    }
}