package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeelBanana {
    //private Peel<Banana>[] peels = new Peel<Banana>[5];
    private List<Peel<Banana>> bananas = new ArrayList<>(Arrays.asList(new Peel<>(), new Peel<>(),
            new Peel<>(), new Peel<>()));

    public List<Peel<Banana>> getBananas() {
        return bananas;
    }
}
