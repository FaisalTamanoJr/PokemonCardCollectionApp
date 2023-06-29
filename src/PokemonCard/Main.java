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
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Fields
    private static final String pokemonData = "Pokemon.txt";

    public static void main(String[] args) {
        ArrayList<Pokemon> database = loadStats();
        System.out.println(database.get(25).getType()[0]);
    }

    // Load the Pokémon stats
    private static ArrayList<Pokemon> loadStats() {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        String[] pokemonStats; //Pokémon stat array containing each Pokémon and  their attributes
        try {

            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader("assets/" + pokemonData);

            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);

            while (text.hasNext()) {
                String line = text.nextLine();

                pokemonStats = line.split(",");
                if (pokemonStats[6].contains("/")){
                    PokemonDual tempPokemon = new PokemonDual();
                    tempPokemon.setName(pokemonStats[0]);
                    tempPokemon.setWeight(Float.parseFloat(pokemonStats[1].replace("kg", "")));
                    tempPokemon.setHeight(Float.parseFloat(pokemonStats[2].replace("m","")));
                    tempPokemon.setAttack(Float.parseFloat(pokemonStats[3]));
                    tempPokemon.setDefense(Float.parseFloat(pokemonStats[4]));
                    tempPokemon.setStamina(Float.parseFloat(pokemonStats[5]));
                    tempPokemon.setType(pokemonStats[6]);

                    pokemons.add(tempPokemon);
                }
                else {
                    PokemonSingle tempPokemon = new PokemonSingle();
                    tempPokemon.setName(pokemonStats[0]);
                    tempPokemon.setWeight(Float.parseFloat(pokemonStats[1].replace("kg", "")));
                    tempPokemon.setHeight(Float.parseFloat(pokemonStats[2].replace("m","")));
                    tempPokemon.setAttack(Float.parseFloat(pokemonStats[3]));
                    tempPokemon.setDefense(Float.parseFloat(pokemonStats[4]));
                    tempPokemon.setStamina(Float.parseFloat(pokemonStats[5]));
                    tempPokemon.setType(pokemonStats[6]);

                    pokemons.add(tempPokemon);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        }
        return pokemons;
    }
}