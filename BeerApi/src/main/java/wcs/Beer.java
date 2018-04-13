package wcs;

import java.util.List;

public class Beer {

    int id;
    String name;
    List<Ingredient> ingredient;

    public Beer(int id, String name,List<Ingredient> ingredient){
        this.name = name;
        this.id = id;
        this.ingredient = ingredient;

    }

}
