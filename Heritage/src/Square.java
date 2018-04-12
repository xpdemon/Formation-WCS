public class Square extends Polygone{


    public Square(double cote1, double cote2) {
        super(cote1, cote2);
        this.type = "Square";

    }

    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int setId() {
        return 0;
    }
}
