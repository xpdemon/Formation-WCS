import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static  List printGeometries(int nbformes) {

        int lower ;
        int higher;
        int random;
        double random2 = 0;
        double random3 = 0;
        String sortie="";


        List<Geometrie> geometries = new LinkedList<>();
        List<Geometrie> refGeometries = new ArrayList<>();

       for (int i=0;i < nbformes;i++){
                lower=1;
                higher=12;
                random2 = (int) (Math.random()*(higher+1-lower))+lower;
                random3 = (int) (Math.random()*(higher+1-lower))+lower;
                Geometrie a = new Rectangle(random2,random3);
                random2 = (int) (Math.random()*(higher+1-lower))+lower;
                Geometrie b = new Square(random2,random2);
                random3 = (int) (Math.random()*(higher+1-lower))+lower;
                Geometrie c = new Circle(random3);

                refGeometries.add(0,a);
                refGeometries.add(1,b);
                refGeometries.add(2,c);

                lower=0;
                higher=2;
                random = (int) (Math.random()*(higher+1-lower))+lower;
                Geometrie form = refGeometries.get(random);
                form.setId(i+1);
                geometries.add(i,form);
                sortie = form.getName()+" "+form.getId()+" "+form.getPerimetre()+" "+form.getArea();
                System.out.println(sortie);
                refGeometries.clear();


        }

        return  geometries;
    }




    public static void main(String[] args) {

     printGeometries(5);
    }
}
