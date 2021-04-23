import java.util.Random;

public class PokemonPrize {
    private final String pokemons[] = new String[] {"Bulbasur", "Charmander", "Squirtle", "Pikachu"};

    @Override
    public String toString() {
        final var i = new Random().nextInt(pokemons.length - 1 + 1);
        return pokemons[i];
    }
}
