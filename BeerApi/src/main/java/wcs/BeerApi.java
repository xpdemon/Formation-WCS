package wcs;

public class BeerApi {

    public static void main(String[] args){
        //Connector connector = new Connector("https://api.punkapi.com/v2/beers");
        CatchAllBeers allBeers = new CatchAllBeers("https://api.punkapi.com/v2/beers");
        System.out.println(allBeers.getJsonAllBeers());
    }
}
