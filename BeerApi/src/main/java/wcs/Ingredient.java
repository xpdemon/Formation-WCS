package wcs;


import java.math.BigDecimal;

public class Ingredient  {

    private String type;
    private String name;
    BigDecimal quantities;

    protected Ingredient(String type,String name){
        this.type = type;
        this.name = name;

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantities() {
        return quantities;
    }
}
