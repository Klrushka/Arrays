package generators;

import java.math.BigDecimal;

public class BDGenerator implements Generator<java.math.BigDecimal>{
    @Override
    public BigDecimal next() {
        return BigDecimal.valueOf(Math.random());
    }
}
