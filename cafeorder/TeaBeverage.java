public abstract class TeaBeverage extends Beverage {

    private boolean hasLemon = false;

    public TeaBeverage(boolean hasLemon,int size){

        super(size);
        this.hasLemon = hasLemon;

    }

    @Override
    public abstract int cost();
    @Override
    public abstract String getName();





}
