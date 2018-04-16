
package wcs;


public class CatchBeerById {

    private Beer beerById;


    protected  CatchBeerById(int findingId,CatchAllBeers allBeers){
        this.beerById = beerById(findingId,allBeers);
    }

    private static Beer beerById(int findingId ,CatchAllBeers allBeers){
       Beer beer = allBeers.getAllBeers().get(findingId-1);
       return beer;
    }
    public Beer getBeerById() {
        return beerById;
    }
}



