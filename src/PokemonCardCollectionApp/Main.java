/*
 * Classname: EQ3
 *
 * Author: Faisal Richard D. Tamano Jr.
 *
 * Date: 2023/06/19
 *
 * Description: PokemonCard.Main part of the program.
 */

package PokemonCardCollectionApp;

public class Main {
    // variables
    public static final String pokemonData = "Pokemon.txt";

    public static void main(String[] args) {
        (new PokemonCardCollection()).start(args);
    }

}