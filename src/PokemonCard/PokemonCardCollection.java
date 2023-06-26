package PokemonCard;
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class PokemonCardCollection extends ConsoleProgram{
    private PokemonCanvas canvas; // Draws the cards similar to Hangman
    private PokemonCards pokemonDeck; // Card collection object
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private String[][] database;

    public PokemonCardCollection(String[][] database) {
        this.database = database;
    }

    public void run() {
        int choice;
        do {
            choice = displayMenu();
        } while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4) && (choice != 5));
    }

    private int displayMenu(){
        println("Choose an Option:");
        println("1-Remove a Pokemon");
        println("2-View One Pokemon");
        println("3-View slideshow of Pokemon");
        println("4-Search a Pokemon");
        println("5-Quit");
        return readInt("Choice: ");
    }

    //TODO
    public void init() {
        canvas = new PokemonCanvas(); // Responsible for displaying
        the cards
        add(canvas);
        setTitle("Pokemon Card Collection");
        setSize(1280, 720);
    }
    public static void main(String[] args)
    {
        (new PokemonCardCollection()).start(args);
    }
}
