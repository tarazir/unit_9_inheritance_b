public class Elephant extends Herbivore {

    private double tusklength;

    public Elephant(String name, double length) {
        super("elephant", name);
        this.tusklength = length;
    }

    @Override
    public String toString() {
        return super.toString() + " with tusks " + tusklength + " meters long";
    }
}
