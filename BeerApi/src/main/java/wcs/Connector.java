package wcs;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;


public class Connector {

    private String url;
    private JsonArray jsonArray;


    protected Connector (String url){

        this.jsonArray = connect(url);

    }

    private static JsonArray connect (String url){

        JsonArray array = null;
        try{
            InputStream is = new URL(url).openStream();
            JsonReader reader = Json.createReader(new InputStreamReader(is, "UTF-8"));
            array = reader.readArray();
            is.close();
        }
        catch (IOException e){
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE,null,e);
        }

        return array;

    }



    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public JsonArray getjsonArray() {
        return jsonArray;
    }


}
