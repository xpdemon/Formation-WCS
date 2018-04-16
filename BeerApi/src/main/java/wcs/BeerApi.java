package wcs;

public class BeerApi {

    public static void main(String[] args){
        Connector connector = new Connector("https://api.punkapi.com/v2/beers");
        CatchAllBeers allBeers = new CatchAllBeers(connector);
        CatchBeerByName beerByName = new CatchBeerByName("bûzz",allBeers);
        System.out.println(beerByName.getBeerByName().getId()+" "+beerByName.getBeerByName().getName());

    }
}
