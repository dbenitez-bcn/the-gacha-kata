import java.util.Random;

public class SuperHeroPrize implements Prize {
    private final String superHeroes[] = new String[] {"Ironman", "Captain america", "Thor", "Dr. Strange", "Black panther", "Hulk"};

    @Override
    public String getPrise() {
        final var i = new Random().nextInt(superHeroes.length - 1 + 1) + 1;
        return superHeroes[i];
    }
}
