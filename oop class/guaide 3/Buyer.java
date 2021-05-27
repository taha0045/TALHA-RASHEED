public class Buyer {
 private String name;
 private Item[] shoppingHistory = new Item[999];
 private int itemsOrdered = 0;
 public Buyer(String name) {
 this.name = name;
 }
 public String getName() {
 return name;
 }
 public void order(Item item) {
 shoppingHistory[itemsOrdered] = item;
 itemsOrdered++;
 System.out.println(item.getName() + " add in your 
basket " + getName());
 System.out.println();
 }
 public void showHistory() {
 boolean historyNull = (itemsOrdered == 0);
 if (historyNull) {
 System.out.println("Your history is NULL!");
 System.out.println();
 }
 else {
 System.out.println("==> Shopping History <==");
 for (int i = 0; i < itemsOrdered; i++)
 shoppingHistory [i].showDetail();
 System.out.println();
 }
 }
 public void clearHistory() {
 shoppingHistory = new Item[999];
 itemsOrdered = 0;
 System.out.println("Your history is successfully 
cleared!");
 System.out.println();
 }
}
