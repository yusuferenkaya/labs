public class TestCafe {

    public static void main(String[] args) {

        Order order = new Order();
        CaffeineBeverage cBeverage = new Latte(true,0);
        order.add(new OrderItem(cBeverage,2));
        cBeverage = new Cappucino(false,1);
        order.add(new OrderItem(cBeverage,2));
        cBeverage = new Americano(true,2);
        order.add(new OrderItem(cBeverage,1));

        TeaBeverage tBeverage = new BlackTea(false,0);
        order.add(new OrderItem(tBeverage,3));
        tBeverage = new GreenTea(true,1);
        order.add(new OrderItem(tBeverage,1));
        tBeverage = new LindenTea(true,0);
        order.add(new OrderItem(tBeverage,1));

        System.out.println(order);










    }
}
