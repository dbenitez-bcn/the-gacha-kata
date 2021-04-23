import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GachaMachine<T> {
    private final ArrayList<T> prizes = new ArrayList<>();

    public T getPrize() {
        return prizes.get(0);
    }

    public void fillPrizes(T... prize) {
        final var newPrizes = Arrays.stream(prize)
                                    .collect(Collectors.toList());
        prizes.addAll(newPrizes);
    }
}
