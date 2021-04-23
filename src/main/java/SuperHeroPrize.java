import java.util.Random;

public class SuperHeroPrize {
    private final String superHeroes[] = new String[] {"Ironman", "Captain america", "Thor", "Hulk"};

    @Override
    public String toString() {
        final var i = new Random().nextInt(superHeroes.length - 1 + 1);
        return superHeroes[i];
    }
}
