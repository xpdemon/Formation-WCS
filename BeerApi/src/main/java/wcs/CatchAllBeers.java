package wcs;

import javax.json.JsonObject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CatchAllBeers {

    private List<Beer> allBeers;


    protected CatchAllBeers(String url) {
        this.allBeers= allBeers(url);
    }


    private static List<Beer> allBeers(String url) {
        int currentPage = 1;
        int maxPage = 2;
        List<Beer> allBeers = new ArrayList<>();
        while (currentPage != maxPage) {
            Connector connector = new Connector(url + "?page=" + currentPage);
            if(connector.getjsonArray().size()>0) {

                for (int i = 0; i < connector.getjsonArray().size(); i++) {
                    List<Ingredient> ingredients = new ArrayList<>();
                    JsonObject jbeer = connector.getjsonArray().getJsonObject(i);
                    JsonObject jIngredient = jbeer.getJsonObject("ingredients");

                    for (int j = 0; j < jIngredient.getJsonArray("malt").size(); j++) {
                        String type = "malt";
                        String name = jIngredient.getJsonArray("malt").getJsonObject(j).get("name").toString();
                        BigDecimal quantities = jIngredient.getJsonArray("malt").getJsonObject(j).getJsonObject("amount").getJsonNumber("value").bigDecimalValue();
                        Malt ingredient = new Malt(type, name, quantities);
                        ingredients.add(ingredient);
                    }

                    for (int j = 0; j < jIngredient.getJsonArray("hops").size(); j++) {
                        String type = "hops";
                        String name = jIngredient.getJsonArray("hops").getJsonObject(j).get("name").toString();
                        BigDecimal quantities = jIngredient.getJsonArray("hops").getJsonObject(j).getJsonObject("amount").getJsonNumber("value").bigDecimalValue();
                        Hops ingredient = new Hops(type, name, quantities);
                        ingredients.add(ingredient);
                    }

                    String type = "yeast";
                    String yeast = jIngredient.get("yeast").toString();
                    Yeast ingredient = new Yeast(type, yeast);
                    ingredients.add(ingredient);

                    String name = jbeer.get("name").toString();
                    int id = jbeer.getInt("id");
                    Beer beer = new Beer(id, name, ingredients);
                    allBeers.add(beer);

                }
                maxPage ++;
                currentPage++;
            }
            else if (connector.getjsonArray().size()<=0){
                currentPage++;
            }
        }
        return allBeers;
    }

    public List<Beer> getAllBeers() {
        return allBeers;
    }
}


