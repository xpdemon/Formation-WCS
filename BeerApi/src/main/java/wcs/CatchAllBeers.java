package wcs;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import java.io.InputStreamReader;
import java.net.URL;

public class CatchAllBeers{

    private JsonArray JsonAllBeers;




    protected CatchAllBeers(String url) {
        this.JsonAllBeers= allBeers(url);
    }



    private static JsonArray allBeers(String url){
        int currentPage=1;
        int maxPage = 10;

        JsonArray allBeersArray = null;
        while (currentPage != maxPage) {
            Connector connector = new Connector(url+"?page="+currentPage);
            for(int i=0 ; i< connector.getjsonArray().size();i++) {
                allBeersArray.add(i, connector.getjsonArray().get(i));
            }
            currentPage++;
        }
        return allBeersArray;
    }



    public JsonArray getJsonAllBeers() {
        return JsonAllBeers;
    }

    public void setJsonAllBeers(JsonArray jsonAllBeers) {
        JsonAllBeers = jsonAllBeers;
    }
}
