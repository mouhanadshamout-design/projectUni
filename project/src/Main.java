import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory i=new Inventory();
       // i.print();
        Item item=new Item(10, "mouhannad", "Wood", 500, 100, 10);

 Item item1=new Item(10, "mouhannad", "Wood", 500, 100, 10);
ArrayList<Item>items=new ArrayList<>();
items.add(item1);
items.add(item);
    Item.PrintItems(items); 

    }


System.out.println("Test Git Hub");
    }

}
