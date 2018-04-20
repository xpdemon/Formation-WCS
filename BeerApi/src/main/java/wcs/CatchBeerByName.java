package wcs;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class CatchBeerByName {

    private Beer beerByName;

    protected CatchBeerByName(String name , CatchAllBeers allBeers){
        this.beerByName = beerByName(name,allBeers);

    }



    private static Beer beerByName(String name,CatchAllBeers allBeers){
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Beer beer = null;
        name = name.replaceAll("\"","");

        for (int i = 0 ;i < allBeers.getAllBeers().size();i++){
            int comparaison = comparator.compare(name,allBeers.getAllBeers().get(i).getName());
            if (comparaison ==0){
                beer = allBeers.getAllBeers().get(i);
                if (beer != null){break;}
            }
            else if (comparaison != 0 ){
                Collator collator = Collator.getInstance(Locale.FRENCH);
                collator.setStrength(collator.PRIMARY);
                comparaison = collator.compare(name,allBeers.getAllBeers().get(i).getName());
                if(comparaison ==0){
                    beer = allBeers.getAllBeers().get(i);
                    if (beer != null){break;}

                }


            }

        }
        return beer;
    }

    public Beer getBeerByName() {
        return beerByName;
    }
}
