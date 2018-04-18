package wcs;


import javax.json.JsonObject;
import javax.json.JsonArray;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Trash {

    public static void main(String[] args) {


            /*int currentPage=1;
            int maxPage = 10;
            List<Beer> allBeers = new ArrayList<>();
            while (currentPage != maxPage) {
                Connector connector = new Connector("https://api.punkapi.com/v2/beers"+"?page="+currentPage);

                for(int i=0 ; i< connector.getjsonArray().size();i++) {
                    List<Ingredient> ingredients = new ArrayList<>();
                    JsonObject jbeer = connector.getjsonArray().getJsonObject(i);
                    JsonObject jIngredient = jbeer.getJsonObject("ingredients");

                    for(int j = 0 ;j < jIngredient.getJsonArray("malt").size();j++){
                        String type = "malt";
                        String name = jIngredient.getJsonArray("malt").getJsonObject(j).get("name").toString();
                        BigDecimal quantities = jIngredient.getJsonArray("malt").getJsonObject(j).getJsonObject("amount").getJsonNumber("value").bigDecimalValue();
                        Ingredient ingredient = new Ingredient(type,name,quantities);
                        ingredients.add(ingredient);
                    }

                    for(int j = 0 ;j < jIngredient.getJsonArray("hops").size();j++){
                        String type = "hops";
                        String name = jIngredient.getJsonArray("hops").getJsonObject(j).get("name").toString();
                        BigDecimal quantities = jIngredient.getJsonArray("hops").getJsonObject(j).getJsonObject("amount").getJsonNumber("value").bigDecimalValue();
                        Ingredient ingredient = new Ingredient(type,name,quantities);
                        ingredients.add(ingredient);
                    }

                    String name = jbeer.get("name").toString();
                    int id = jbeer.getInt("id");
                    Beer beer = new Beer(id,name,ingredients);
                    allBeers.add(beer);

                }
                currentPage++;
            }*/

        }
    }

