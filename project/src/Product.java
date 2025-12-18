import java.util.ArrayList;
import java.util.HashMap;

public class Product {
int IDProduct;
String NameOfProduct;
HashMap<Item,Integer>HashItems=new HashMap<>();
boolean CheckProduction(HashMap <Item,Integer>items){
   for(Item IdItem:items.keySet() ){

    if(IdItem.isBelowMinimum())
        return true;   }
    return false;

}
}
