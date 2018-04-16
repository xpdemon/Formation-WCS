package wcs;

import java.math.BigDecimal;



public class Malt extends Ingredient {


    protected Malt(String type, String name, BigDecimal quantities) {
        super(type, name);
        this.quantities =  quantities;
    }

}
