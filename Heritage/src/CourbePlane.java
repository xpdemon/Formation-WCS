public abstract class CourbePlane extends Geometrie{

    protected final double Rayon;


    public CourbePlane(double rayon){
        this.Rayon = rayon;
        this.area =calcularea(rayon);
        this.perimetre=calculperimetre(rayon);

    }

    private double calculperimetre(double rayon){
        return 3.14f*(rayon*rayon);
    }

    private double calcularea(double rayon){
        return Math.pow(rayon,4)*3.14;
    }
}
