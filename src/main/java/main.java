public class main {
/**
    The aim of this kata is to learn generic in java.

    To do so, you are going to implement a Gacha machine that you will fill it with different types of prizes
    and you will get prizes from the machine.

    You can start by implementing the get prize method.
 */
    public static void main(String[] args) {
        final var superHeroMachine = new GachaMachine<SuperHeroPrize>();
        superHeroMachine.fillPrizes(new SuperHeroPrize());
        final var superHeroPrize = superHeroMachine.getPrize();

        // Should display a random superhero
        System.out.println(superHeroPrize);

        final var pokemonMachine = new GachaMachine<PokemonPrize>();
        pokemonMachine.fillPrizes(new PokemonPrize());
        final var pokemonPrize = pokemonMachine.getPrize();

        // Should display a random superhero
        System.out.println(pokemonPrize);
    }

}
