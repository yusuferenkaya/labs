public class OrderItem {

    int amount;
    Beverage beverage;

    public OrderItem(Beverage beverage, int amount){


        this.beverage = beverage;
        this.amount = amount;
    }

    public int cost(){

        int cost = beverage.cost();
        return cost * amount;
    }

    public String getName() {
        return (amount + " "+ beverage.getName() + " ");
    }



}
