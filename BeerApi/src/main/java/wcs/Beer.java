package wcs;

import java.util.List;

public class Beer {

    private int id;
    private String name;
    private String beerUrls;
    private List<Ingredient> ingredient;
    private String description;

    protected Beer(int id, String name,List<Ingredient> ingredient,String beerUrls,String description){
        this.name = name;
        this.id = id;
        this.ingredient = ingredient;
        this.beerUrls = beerUrls;
        this.description = description;

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

    public String getBeerUrls() {
        return beerUrls;
    }

    public String getDescription() {
        return description;
    }
}
