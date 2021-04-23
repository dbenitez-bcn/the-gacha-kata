public class main {
/**
    The aim of this kata is to learn generic in java.

    To do so, you are going to implement a Gacha machine that you will fill it with different types of prizes
    and you will get prizes from the machine.

    You can start by implementing the get prize method.
 */
    public static void main(String[] args) {
        final var gachaMachine = new GachaMachine();
        gachaMachine.fillPrizes(new SuperHeroPrize());
        final var superHeroPrize = gachaMachine.getPrize();

        // Should display a random superhero
        System.out.println(superHeroPrize);
    }

}
