package wcs;

import java.math.BigDecimal;

public class Hops extends Ingredient {
    public Hops(String type, String name, BigDecimal quantities) {
        super(type, name);
        this.quantities = quantities;
    }
}
