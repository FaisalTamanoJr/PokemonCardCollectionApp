/*
 * Classname: EQ3
 *
 * Author: Faisal Richard D. Tamano Jr.
 *
 * Date: 2023/06/19
 *
 * Description: Main part of the program.
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static void loadStats(String filename) {
        // filename = "assets/Pokémon.txt"
        // Example function call: loadStats("assets/Pokemon.txt");
        try {
            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader(filename);
            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);

            String[] pokemonStats;
            // Read and display the lines
            while (text.hasNext()) {
                String line = text.nextLine();
                // System.out.println(line); // working!
                // Splits this string around matches of the given regular expression.
                pokemonStats = line.split(",");
                // Doc: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
                // System.out.println(Arrays.toString(pokemonStats));
                // Access of parameters:
                /* System.out.println(Arrays.toString(pokemonStats));
                 System.out.println(pokemonStats[0]); // Names
                 System.out.println(pokemonStats[1]); // Weights
                 System.out.println(pokemonStats[2]); // Heights
                */
                System.out.println(Double.parseDouble(pokemonStats[3]));//Attack
                //
                System.out.println(Double.parseDouble(pokemonStats[4]));// Defense
                //
                System.out.println(Double.parseDouble(pokemonStats[5]));// Stamina
                System.out.println(pokemonStats[6]); // Types
            }
            // System.out.println(Arrays.toString(pokemonStats));
            // e.g. [Poliwrath, 54.0kg, 1.3m, .90, .90, .95, Water/Fighting]
        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        }
    }
}