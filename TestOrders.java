import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.2);
        Item item3 = new Item("drip coffee", 2);
        Item item4 = new Item("cappuccino", 5.43);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Steven");

        order1.addItem(item1);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item4);
        order3.addItem(item2);

        order4.addItem(item2);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item1);

        order2.setReady();
        order1.setReady();

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
