package wcs;

public class BeerApi {

    public static void main(String[] args){

        CatchAllBeers allBeers = new CatchAllBeers("https://api.punkapi.com/v2/beers");
        for ( int i = 0 ; i< allBeers.getAllBeers().size();i++) {
            System.out.println("BEER : " + allBeers.getAllBeers().get(i).id+" : " + allBeers.getAllBeers().get(i).name);
            for (int j=0; j< allBeers.getAllBeers().get(i).ingredient.size();j++){
            System.out.println(allBeers.getAllBeers().get(i).ingredient.get(j).type +" : "+ allBeers.getAllBeers().get(i).ingredient.get(j).name +" : "+ allBeers.getAllBeers().get(i).ingredient.get(j).quantities);

            }
        }
    }
}
