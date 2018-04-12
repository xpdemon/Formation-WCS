public class Rectangle extends Polygone {




    public Rectangle(double cote1, double cote2) {
        super(cote1, cote2);


    }


    public String getName() {
        return "Rectangle" ;
    }

    @Override
    public int setId() {
        return 0;
    }


    public int getId() {
        return super.getId();
    }
}