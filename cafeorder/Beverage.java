public abstract class Beverage {

    private int size;
    private String name;



    public Beverage(int size) {


        this.size = size;

    }

    public abstract int cost();

    public abstract String getName();



}
