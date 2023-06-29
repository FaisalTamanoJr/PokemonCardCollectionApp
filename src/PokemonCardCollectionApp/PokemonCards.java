package PokemonCardCollectionApp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PokemonCards {
    private ArrayList<Pokemon> stats = loadStats();;

    // Load the Pokémon stats
    private ArrayList<Pokemon> loadStats(){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        String[] pokemonStats; //Pokémon stat array containing each Pokémon and  their attributes
        try {

            // Scanner Object reads the line from the file
            FileReader fileReader = new FileReader("assets/" + Main.pokemonData);

            // System.in reads from console while this reads from file
            Scanner text = new Scanner(fileReader);

            while (text.hasNext()) {
                String line = text.nextLine();

                pokemonStats = line.split(",");
                if (pokemonStats[6].contains("/")){
                    PokemonDual tempPokemon = new PokemonDual();
                    tempPokemon.setName(pokemonStats[0]);
                    tempPokemon.setWeight(pokemonStats[1]);
                    tempPokemon.setHeight(pokemonStats[2]);
                    tempPokemon.setAttack(pokemonStats[3]);
                    tempPokemon.setDefense(pokemonStats[4]);
                    tempPokemon.setStamina(pokemonStats[5]);
                    tempPokemon.setType(pokemonStats[6]);

                    pokemons.add(tempPokemon);
                }
                else {
                    PokemonSingle tempPokemon = new PokemonSingle();
                    tempPokemon.setName(pokemonStats[0]);
                    tempPokemon.setWeight(pokemonStats[1]);
                    tempPokemon.setHeight(pokemonStats[2]);
                    tempPokemon.setAttack(pokemonStats[3]);
                    tempPokemon.setDefense(pokemonStats[4]);
                    tempPokemon.setStamina(pokemonStats[5]);
                    tempPokemon.setType(pokemonStats[6]);

                    pokemons.add(tempPokemon);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not Exist");
        }
        return pokemons;
    }

    int getSize(){
        return this.stats.size();
    }

    Pokemon getPokemon(int index){
        return stats.get(index);
    }

    void remove(int index){
        stats.remove(index);
    }

    int searchPokemon(String name){
        for (int i = 0; i < getSize(); i++){
            if (Objects.equals(stats.get(i).getName(), name)){
                return i;
            }
        }
        return -1;
    }
}
