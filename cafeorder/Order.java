import java.util.ArrayList;

public class Order {

    private static ArrayList<OrderItem> orderedItems = new ArrayList<>();

    public void add(OrderItem o){

        orderedItems.add(o);

    }

    public int totalCost(){

        int cost = 0;

        for (OrderItem orderedItem : orderedItems){

            cost += orderedItem.cost();

        }

        return cost;
    }
    @Override
    public String toString() {
       String order = "";

       for (OrderItem orderedItem : orderedItems) {

           order += (orderedItem.getName() + " : " + orderedItem.cost() + " TL ");
           order += "\n";
       }

       order += "\n -o-o-o-o-o-o-o-o-o- \n TOTAL PAYMENT : " + totalCost() + " TL" +"\n WE HOPE TO SEE YOU AGAIN IN MUĞLA KAFE. \n BONNE APPETITE";

       return order;
    }








}
