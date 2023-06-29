package PokemonCardCollectionApp;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class PokemonCardCollection extends ConsoleProgram{
    private PokemonCanvas canvas; // Draws the cards similar to Hangman
    private PokemonCards pokemonDeck; // Card collection object
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        int choice;
        pokemonDeck = new PokemonCards();
        do {
            choice = menuChoice();
            switch (choice){

                // Remove a Pokemon in the database
                case 1:
                    int num;
                    for (int x = 0; x < pokemonDeck.getSize(); x++) {
                        num = x + 1;
                        print("[" + num + "]");
                        println(pokemonDeck.getPokemon(x).getName());
                    }
                    pokemonDeck.remove((readInt("Choose to Remove a Pokemon: ") - 1));
                    break;

                // View One Pokemon in the database
                case 2:
                    int random = rgen.nextInt(0, pokemonDeck.getSize() - 1);
                    canvas.showPokemon(pokemonDeck.getPokemon(random));
                    break;

                // View slideshow of Pokemon
                case 3:
                for (int x = 0; x < pokemonDeck.getSize(); x++) {
                    canvas.clear();
                    canvas.showPokemon(pokemonDeck.getPokemon(x));
                    pause(1000);
                    canvas.clear();
                }
                break;

                // Search a Pokemon
                case 4:
                    String name = readLine("Enter the pokemon name to search: ");
                    int index = pokemonDeck.searchPokemon(name);
                    if (index != -1){
                        println("Pokemon "+ name + " is found!");
                        canvas.showPokemon(pokemonDeck.getPokemon (index));
                    }
                    else {
                        println("Sorry: " + name + " is not found in the database!");
                    }
                    break;

                // Quit
                case 5:
                    println("Thank you for using the Program");
                    break;

                // Invalid Input
                default:
                    println("Invalid Input");
                    break;
            }
        } while (choice != 5);
    }

    private int menuChoice(){
        println("Choose an Option:");
        println("1-Remove a Pokemon");
        println("2-View One Pokemon");
        println("3-View slideshow of Pokemon");
        println("4-Search a Pokemon");
        println("5-Quit");
        return readInt("Choice: ");
    }

    public void init(){
        canvas = new PokemonCanvas();
        add(canvas);
        setTitle("Pokemon Card Collection");
        setSize(1280, 720);
        println(canvas.getSize());
    }
}