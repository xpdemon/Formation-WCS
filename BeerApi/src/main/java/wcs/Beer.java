package wcs;

import java.util.List;

public class Beer {

    private int id;
    private String name;
    private List<Ingredient> ingredient;

    protected Beer(int id, String name,List<Ingredient> ingredient){
        this.name = name;
        this.id = id;
        this.ingredient = ingredient;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }
}
