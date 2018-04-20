package wcs;

public class BeerApi {

    public static void main(String[] args){
        Connector connector = new Connector("https://api.punkapi.com/v2/beers");
        CatchAllBeers catchAllBeers = new CatchAllBeers(connector);
        CatchBeerById catchBeerById = new CatchBeerById(5,catchAllBeers);

        System.out.println(catchBeerById.getBeerById().getDescription());

    }
}
