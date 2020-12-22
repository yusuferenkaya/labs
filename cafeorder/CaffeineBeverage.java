public abstract class CaffeineBeverage extends Beverage {

    private boolean hasMilk = false;

    public CaffeineBeverage(boolean hasMilk,int size){

        super(size);
        this.hasMilk = hasMilk;

    }


    @Override
    public abstract int cost();
    @Override
    public abstract String getName();















}
