import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    static int IdItem = 0;
    String Name;
    String Category;
    int Price;
    int QuantityAvilable;
    int minimum;
//Constructer 1
    public Item() {}
//Constructer 2
    public Item(int id, String Name, String Category, int Price, int QuantityAvilable, int minimum) {
        this.IdItem = id;
        this.Name = Name;
        this.Category = Category;
        this.Price = Price;
        this.QuantityAvilable = QuantityAvilable;
        this.minimum = minimum;
    }
    //check of Quantity
    public boolean isBelowMinimum()
    {
        return QuantityAvilable > minimum;
    }
    //Add Quantity
        void AddQuantity(int value) 
        {
        this.QuantityAvilable += value;
    }
    //Remove Quantity
    public void RemoveQuantity(int value){
        try{
 if(QuantityAvilable<value)
QuantityAvilable-=value;}
 catch(Exception e){
    System.out.print(e);
 }
    }
    // convert Item To String
    String ConvertToString(Item item) {
        String word = "";
        word += Integer.toString(item.IdItem) + ",";
        word += item.Name + ",";
        word += item.Category + ",";
        word += Integer.toString(item.Price) + ",";
        word += Integer.toString(item.QuantityAvilable) + ",";
        word += Integer.toString(item.minimum);
        return word;
    }
      // ReadItems for convert String to Item
    Item convertToItem(String line) {
        String[] data = line.split(",");
        if (data.length == 6) {
            Item it = new Item();
            it.IdItem = Integer.parseInt(data[0]);
            it.Name = data[1];
            it.Category = data[2];
            it.Price = Integer.parseInt(data[3]);
            it.QuantityAvilable = Integer.parseInt(data[4]);
            it.minimum = Integer.parseInt(data[5]);
            return it;
        } else
            return null;
    }

//     ArrayList<Item> itemsList = new ArrayList<>();
//     Scanner in = new Scanner(System.in);

//     void AddQuantity(int value) {
//         this.QuantityAvilable += value;
//     }

//     File file = new File("Item.txt");

//     // Write File for Write on file
//     void WriteFile(String text) {
//         try {
//             // File file = new File("Item.txt");
//             FileWriter writer = new FileWriter(file, true);
//             writer.write(text);
//             writer.flush();
//             writer.close();

//         } catch (IOException e) {
//             System.out.print(e.toString());

//         }
//     }

//     // ArrayList<Item> listItem=new ArrayList<>();

//     // Read Item
//     Item ReadItemInfo() {

//         Item it = new Item();
//         it.IdItem += 1;
//         it.Name = in.next();
//         it.Category = in.next();
//         it.Price = in.nextInt();
//         it.QuantityAvilable = in.nextInt();
//         it.minimum = in.nextInt();
//         return it;
//     }



//     public


//     // Add Item
//     void AddItem(Item item) {
//         item = ReadItemInfo();
//         itemsList.add(item);
//         WriteFile(ConvertToString(item));

//     }

//    static void PrintItem(Item item) {

//         System.out.printf("%-15d", item.IdItem);
//         System.out.printf("%-30s", item.Name);
//         System.out.printf("%-30s", item.Category);
//         System.out.printf("%-10d", item.Price);
//         System.out.printf("%-20d", item.QuantityAvilable);
//         System.out.printf("%-5d", item.minimum);
//         System.out.println();
//     }
//      static void PrintItems(ArrayList<Item>items){
// System.out.printf("%-15s","ID Item |");
// System.out.printf("%-30s","Name |");
// System.out.printf("%-30s","Category |");
// System.out.printf("%-10s","Price |");
// System.out.printf("%-20s","Quantity Avilable |");
// System.out.printf("%-5s","Minimum |");
// System.out.println();
// for(Item i:items){
// PrintItem(i);

// }
//     }
//     void PrintFromFile(){
//         try{
//   FileReader Readf=new FileReader(file);
//     BufferedReader Bfr=new BufferedReader(Readf);
//     String line;
//     while((line=Bfr.readLine())!=null){
//         PrintItem(convertToItem(line));
//     } 

//         }
//         catch(Exception e){
//             System.out.print(e.toString());
//         }
//     }
}