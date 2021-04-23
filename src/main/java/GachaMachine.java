import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GachaMachine {
    private final ArrayList<SuperHeroPrize> prizes = new ArrayList<>();

    public SuperHeroPrize getPrize() {
        return prizes.get(0);
    }

    public void fillPrizes(SuperHeroPrize... prize) {
        final var newPrizes = Arrays.stream(prize)
                                  .collect(Collectors.toList());
        prizes.addAll(newPrizes);
    }
}
