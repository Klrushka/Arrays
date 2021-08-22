package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeelBanana {
    //private Peel<Banana>[] peels = new Peel<Banana>[5];
    private static List<Peel<Banana>> bananas = new ArrayList<>();

    private static void fill(){
        for (int i =0 ; i  < 3; i ++){
            bananas.add(new Peel<>());
        }
    }
    public List<Peel<Banana>> getBananas() {
        fill();
        return bananas;
    }
}
