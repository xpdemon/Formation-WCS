public abstract class Geometrie implements Drawable {

    protected  double area;
    protected  double perimetre;
    protected String type;
    protected int id;



    public  Geometrie(){
        this.area= 0;
        this.perimetre= 0;
        this.id = 0;

    }



    public String getArea() {
        return "L'air est de " +area +" cm²";
    }


    public String getPerimetre() {

        return "Le perimetre est de " + perimetre+" cm";
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}

