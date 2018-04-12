public abstract class Polygone  extends Geometrie{

   protected final double cote1;
   protected final double cote2;

   public Polygone(double cote1,double cote2){
       this.cote1 = cote1;
       this.cote2 = cote2;
       this.perimetre = calculPerimetre(cote1,cote2);
       this.area = calculArea(cote1,cote2);
   }

    private double calculPerimetre(double cote,double cote2){return 2*(cote+cote2);
    }

    private double calculArea(double cote,double cote2){
        return cote*cote2;
    }


}
