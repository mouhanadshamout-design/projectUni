import java.util.ArrayList;
import java.util.HashMap;

public class Product {
private int IDProduct;
private String NameOfProduct;
private int ProductQuantity;
private HashMap<Item,Integer>requiredItems=new HashMap<>();
//___________________________________________________________________________________
        public Product(int id, String name) {
        this.IDProduct =id;
        this.NameOfProduct = name;
        this.requiredItems = new HashMap<>();
        this.ProductQuantity = 0;
    }
            public Product() {}


//______________________________________________________________________________________

    // إضافة مادة خام مطلوبة للإنتاج
    public void addRequiredItem(Item item, int amount) {
        if (amount > 0) {
            requiredItems.put(item, amount);
        }
    }

    // زيادة كمية المنتج المصنّع
        public void increaseQuantity(int ProductQuantity) {
        if (ProductQuantity > 0) {
           this.ProductQuantity += ProductQuantity;
        }
    }


    



















// boolean CheckProduction(HashMap <Item,Integer>items){
//    for(Item IdItem:items.keySet() ){
//     if(IdItem.isBelowMinimum())
//         return true;   }
//     return false;
// }





}
