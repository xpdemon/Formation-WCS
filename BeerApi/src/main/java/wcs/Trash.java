package wcs;


import javax.json.JsonObject;
import javax.json.JsonArray;

public class Trash {

    public static void main(String[] args) {


            int currentPage=1;
            int maxPage = 10;

            JsonArray allBeersArray = null;
            while (currentPage != maxPage) {
                Connector connector = new Connector("https://api.punkapi.com/v2/beers"+"?page="+currentPage);
                for(int i=0 ; i< connector.getjsonArray().size();i++) {
                    JsonObject jbeer = connector.getjsonArray().getJsonObject(i);
                    

                    Ingredient ingredient = new Ingredient();

                    String name = jbeer.get("name").toString();
                    int id = jbeer.getInt("id");
                    Beer beer = new Beer(id,name);
                    System.out.println(allBeersArray.toString());
                }
                currentPage++;
            }
            System.out.println(allBeersArray.toString());
        }
    }

